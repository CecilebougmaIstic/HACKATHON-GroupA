package org.trans_hack.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.trans_hack.model.Artiste;
import org.trans_hack.model.Concert;
import org.trans_hack.model.Fields;
import org.trans_hack.model.Geometry;
import org.trans_hack.service.ConcertService;
import org.trans_hack.utils.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
@RestController
@RequestMapping("/api")
public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @PostMapping("/concerts")
    public String saveFields(@RequestBody Concert concert) throws ExecutionException, InterruptedException {
        concert.setId(Utils.generateUUID());
        System.out.println(concert.toString() );
        return  concertService.saveFields(concert);

    }
/*Pour enregistrer un concert*/
    @PostMapping("/concerts/v2")
    public String saveFields(@RequestBody Artiste artiste) throws ExecutionException, InterruptedException {
        Concert concert=new Concert();
        concert.setFields(new Fields());
        concert.setGeometry(new Geometry());
        concert.setId(Utils.generateUUID());
        concert.getFields().setArtistes(artiste.getNomGroupe());
        concert.getFields().set_1ere_date(artiste.getDateConcert());
        concert.getFields().setEdition(artiste.getEdition());
        concert.getFields().setOrigine_pays1(artiste.getPaysOrigine());
        concert.getFields().setNom_spectacle_ou_soiree(artiste.getNomSpectacle());
        concert.setAnnuler(artiste.isAnnuler());
        concert.setPrix(artiste.getPrix());
        concert.setNotation(artiste.getNotation());
        concert.setAdresseConcert(artiste.getAdresseConcert());
        concert.getGeometry().setCoordinates(artiste.getLieuCoordonnee());
        //System.out.println(concert.toString() );
        return  concertService.saveFields(concert);

    }
/*Pour modifier un concert en  fournissant en paramètre un artiste*/
    @PutMapping("/concerts/v2/{id}")
    public String updateFields(@RequestBody Artiste artiste, @PathVariable("Id") String id  ) throws ExecutionException, InterruptedException {
        Concert concert = new Concert();
        if(artiste.getId()!=null) {
            concert.setId(artiste.getId());
            concert.getFields().setArtistes(artiste.getNomGroupe());
            concert.getFields().set_1ere_date(artiste.getDateConcert());
            concert.getFields().setEdition(artiste.getEdition());
            concert.getFields().setOrigine_pays1(artiste.getPaysOrigine());
            concert.getFields().setNom_spectacle_ou_soiree(artiste.getNomSpectacle());
            concert.setAnnuler(artiste.isAnnuler());
            concert.setNotation(artiste.getNotation());
            concert.setPrix(artiste.getPrix());
            concert.setAdresseConcert(artiste.getAdresseConcert());
            concert.getGeometry().setCoordinates(artiste.getLieuCoordonnee());
            System.out.println(concert.toString());
           return concertService.saveFields(concert);
        }else
        return  "L'identifiant du concert est requis";

    }


/*Pour injecter la Base de données dans Firebase*/
    @PostMapping("/concerts/initAnciensConcerts")
    public String saveFieldsBulk() throws ExecutionException, InterruptedException, IOException {
          List<Concert> concerts=readFile();
        for(Concert concert:concerts)
        {
            concert.setId(Utils.generateUUID());
            concertService.saveFields(concert);
        };

        return  "OK";

    }

    private List<Concert> readFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        List<Concert> concerts =  Arrays.asList(objectMapper.readValue(new File("src/main/resources/transMusical.json"), Concert[].class));
        return concerts;
    }
    /*Get ALL Concerts*/
    @GetMapping("/concerts")
    public List<Concert> getArtistAllDetails() throws ExecutionException, InterruptedException {
        return concertService.getFieldsDetail();
    }


/*l’exploration des différents artistes qui ont participé aux Transmusicales par une liste, et la recherche
par le critère pays
--Affichage des artistes par leur pays origine1
*/
    @GetMapping("/concerts/artistes")
    public List<Concert> getOneArtistDetails(@RequestParam (required = true) String artiste, @RequestParam (required = false) String pays
  ) throws ExecutionException, InterruptedException {
        System.out.println("+++++++++++++++++++++" +artiste);
        return concertService.getConcertByArtistes(artiste,pays);
    }


    @GetMapping("/concerts/year")
    public List<Concert> getinfoConcertByYear(@RequestParam (required = true) String year)
     throws ExecutionException, InterruptedException {
        System.out.println("+++++++++++++++++++++" +year);
        return concertService.getInfoConcertByYear(year);
    }

}
