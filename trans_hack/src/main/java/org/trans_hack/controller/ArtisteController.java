package org.trans_hack.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.trans_hack.model.Artiste;
import org.trans_hack.model.Concert;
import org.trans_hack.service.ArtisteService;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class ArtisteController {
    @Autowired
    ArtisteService artisteService;
    /*L’exploration des différents artistes qui ont participé aux Transmusicales par une liste,*/
    /*Retourne la liste de artistes avec des infos sur******/
    @GetMapping("/artistes")
    public List<Artiste> getAllArtistes() throws ExecutionException, InterruptedException {
        return artisteService.getListeArtist();
    }

/*Retourne la liste des artistes
sans doublons*/

    @GetMapping("/artistes/only")
    public List<Artiste> getOnlyArtistes() throws ExecutionException, InterruptedException {
        return artisteService.getListeArtistDeTransMusical();
    }

/*la selection d’un artiste pour afficher des informations supplémentaires (lieux, évènements dans
lesquels il est apparu, dates, pays, etc)*/
    @GetMapping("/artistes/concerts")
    public List<Artiste> getArtisteConcerts(@RequestParam (required = true) String nomGroupe) throws ExecutionException, InterruptedException {
        System.out.println("+++++++++++++++++++++" +nomGroupe);
        return artisteService.getArtisteConcerts(nomGroupe);
    }


    /*l’exploration des différents artistes pour une journée donnée pour les Transmusicales en cours*/
    @GetMapping("/artistes/jour")
    public List<Artiste> getADayArtist(@RequestParam(required = true) String jour) throws ExecutionException, InterruptedException {
        return artisteService.getDayArtist(jour);
    }

    /*supprimer un artiste pour les Transmusicales en cours*/
    @DeleteMapping("/artistes/{id}")
    public String deleteAnArtist(@RequestBody Artiste artiste, @PathVariable("Id") String nomGroupe ) throws ExecutionException, InterruptedException {

        if (artiste.getId() != null) {
            return artisteService.deleteArtist(nomGroupe);
        }else
            return  "L'artiste doit exister dans la base afin de pouvoir le supprimer";
    }

}
