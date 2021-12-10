package org.trans_hack.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.trans_hack.model.Artiste;
import org.trans_hack.model.Concert;
import org.trans_hack.model.Geometry;
import org.trans_hack.utils.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
@Service
public class ArtisteService {
    public static final String COLLECTION_NAME = "concerts";

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcertService.class);


    /*l’exploration des différents artistes qui
   ont participé aux Transmusicales par une liste*/
    public List<Artiste> getListeArtist( ) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Iterable<DocumentReference> documentReference = dbFirestore.collection(COLLECTION_NAME).listDocuments();
        Iterator<DocumentReference> iterator =documentReference.iterator();
        List<Artiste>listArtist = new ArrayList<Artiste>();
        Concert concert=null;
        //Geometry coordonneesGeometric =null;
        while(iterator.hasNext()){
            DocumentReference documentReference1 = iterator.next();
            ApiFuture<DocumentSnapshot> future = documentReference1.get();
            DocumentSnapshot document = future.get();
            concert = document.toObject(Concert.class);
            Artiste infosArtiste = new Artiste();
            infosArtiste.setNomGroupe(concert.getFields().getArtistes());
            infosArtiste.setNomSpectacle(concert.getFields().getNom_spectacle_ou_soiree());
            infosArtiste.setDateConcert(concert.getFields().get_1ere_date());
            infosArtiste.setPaysOrigine(concert.getFields().getOrigine_pays1());
           // System.out.println("**************"+infosArtiste.getNomGroupe());
            infosArtiste.setAdresseConcert(concert.getAdresseConcert());
            infosArtiste.setEdition(concert.getFields().getEdition());
            infosArtiste.setAnnuler(concert.isAnnuler());
            infosArtiste.setId(concert.getId());
            infosArtiste.setNotation(concert.getNotation());
            if(concert.getGeometry()!=null && concert.getGeometry().getCoordinates()!=null ){
            infosArtiste.setLieuCoordonnee(concert.getGeometry().getCoordinates());
            }
            listArtist.add(infosArtiste);
            System.out.println(infosArtiste.toString());
        }

        System.out.println("fin---------------");
        return listArtist;
    }

    /*l’exploration des différents artistes qui
   ont participé aux Transmusicales par une liste*/
    public List<Artiste> getListeArtistDeTransMusical( ) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Iterable<DocumentReference> documentReference = dbFirestore.collection(COLLECTION_NAME).listDocuments();
        Iterator<DocumentReference> iterator =documentReference.iterator();
        List<Artiste>listArtist = new ArrayList<Artiste>();
        Concert concert=null;
        //Geometry coordonneesGeometric =null;
        while(iterator.hasNext()){
            DocumentReference documentReference1 = iterator.next();
            ApiFuture<DocumentSnapshot> future = documentReference1.get();
            DocumentSnapshot document = future.get();
            concert = document.toObject(Concert.class);

            if(!Utils.testListContainArtiste(listArtist,concert.getFields().getArtistes())) {
                Artiste infosArtiste = new Artiste();
                infosArtiste.setNomGroupe(concert.getFields().getArtistes());
                 listArtist.add(infosArtiste);
                System.out.println(infosArtiste.toString());
            }
        }

        System.out.println("fin---------------");
        return listArtist;
    }


/*A partir d'un artiste, afficher des informations supplémentaires (lieux, évènements dans
lesquels il est apparu, dates, pays, etc)*/
    public List<Artiste> getArtisteConcerts(String nomGroupe) throws ExecutionException, InterruptedException {

        List<Artiste> listConcertArtiste= new ArrayList<Artiste>();
        if (nomGroupe == null) {
            System.out.println("++++++*******************************+++++++++++++++" + nomGroupe);
            LOGGER.info("TAG_MEDIUM_MYRICK_CHOW", "Veuillez saisir un nom d'artiste");
        } else {
            Firestore dbFirestore = FirestoreClient.getFirestore();

            Concert concert = null;
            CollectionReference concerts = dbFirestore.collection(COLLECTION_NAME);
            Query query = concerts.whereEqualTo("fields.artistes", nomGroupe);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
            for (DocumentSnapshot document : documents) {
                concert = document.toObject(Concert.class);
                Artiste artiste = new Artiste();
                artiste.setNomGroupe(concert.getFields().getArtistes());
                artiste.setEdition(concert.getFields().getEdition());
                artiste.setDateConcert(concert.getFields().get_1ere_date());
                artiste.setPaysOrigine(concert.getFields().getOrigine_pays1());
                System.out.println("**************" + artiste);
                listConcertArtiste.add(artiste);
                //System.out.println("*************" + listConcertArtiste);
            }
        }
        return listConcertArtiste;

    }
    /*l’exploration des différents artistes pour une journée donnée pour les Transmusicales en cours*/

    public List<Artiste> getDayArtist(String day) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        List<Artiste> lisDayArtist = new ArrayList<Artiste>();

        Concert concert = null;
        CollectionReference concerts = dbFirestore.collection(COLLECTION_NAME);
        Query query = concerts.whereEqualTo("fields._1ere_date", Utils.convertDateToFireFormat(day));
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
        if (day == null) {
            System.out.println("++++++*******************************+++++++++++++++" + day);
            LOGGER.info("TAG_MEDIUM_MYRICK_CHOW", "Veuillez saisir une date pour rechercher les artistes");
        } else {
            for (DocumentSnapshot document : documents) {
                concert = document.toObject(Concert.class);
                Artiste dayArtists = new Artiste();
                dayArtists.setNomGroupe(concert.getFields().getArtistes());
                dayArtists.setEdition(concert.getFields().getEdition());
                dayArtists.setDateConcert(concert.getFields().get_1ere_date());
                System.out.println("**************" + dayArtists);
                lisDayArtist.add(dayArtists);
                System.out.println("*************" + dayArtists);
            }
        }
        return lisDayArtist;

    }
}