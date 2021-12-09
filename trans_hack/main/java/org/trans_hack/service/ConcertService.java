package org.trans_hack.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.trans_hack.model.Artiste;
import org.trans_hack.model.Concert;
import org.trans_hack.model.Fields;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
@Service
public class ConcertService {
    public static final String COLLECTION_NAME="concerts";

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcertService.class);


    public String saveFields(Concert concert) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(concert.getId()).set(concert);
        System.out.println(concert);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public List<Concert> getFieldsDetail() throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Iterable<DocumentReference> documentReference = dbFirestore.collection(COLLECTION_NAME).listDocuments();
        Iterator<DocumentReference> iterator =documentReference.iterator();
        List<Concert>listConcert = new ArrayList<Concert>();
        Concert concert=null;
        while(iterator.hasNext()){
            DocumentReference documentReference1 = iterator.next();
            ApiFuture<DocumentSnapshot> future = documentReference1.get();
            DocumentSnapshot document = future.get();
            concert = document.toObject(Concert.class);
            listConcert.add(concert);
            System.out.println(listConcert);
        }
        return listConcert;
    }
/*l’exploration des différents artistes qui
ont participé aux Transmusicales par une liste, et la recherche
par quelques critères (pays, année, ...).
*/

    /*Recherche des informations par lescritères de filtre: artiste, pays*/
    public List<Concert> getConcertByArtistes(String artiste, String pays) throws ExecutionException, InterruptedException {
        System.out.println("+++++++++++++++++++++" + pays);
        List<Concert> listConcerts = new ArrayList<Concert>();
        Concert concert = null;
        Firestore dbFirestore = FirestoreClient.getFirestore();
        // Create a reference to the cities collection
        CollectionReference concerts = dbFirestore.collection(COLLECTION_NAME);
    // Create a query against the collection.
        Query query  = concerts.whereEqualTo("fields.artistes", artiste);

            if (pays!=null) {
                query = query.whereEqualTo("fields.origine_pays1", pays);
            }

// retrieve  query results asynchronously using query.get()
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
            if (documents.isEmpty()) {
                System.out.println("++++++*******************************+++++++++++++++" + pays);
                LOGGER.info("TAG_MEDIUM_MYRICK_CHOW", "The document does not exist in the given collection");
                return null;
            } else {

                for (DocumentSnapshot document : documents) {
                    System.out.println(document.getId());
                    concert = document.toObject(Concert.class);
                    listConcerts.add(concert);
                }
                System.out.println("Edition:" + listConcerts.get(0).getFields().getEdition());
                return listConcerts;
            }


    }




    /*Recherche des informations par les critères de filtre:  année*/
    public List<Concert> getInfoConcertByYear(String anneeConcert ) throws ExecutionException, InterruptedException {
        System.out.println("+++++++++++++++++++++" + anneeConcert);
        List<Concert> ConcertsInfos = new ArrayList<Concert>();
        Concert concert = null;
        Firestore dbFirestore = FirestoreClient.getFirestore();
        // Create a reference to the cities collection
        CollectionReference concerts = dbFirestore.collection(COLLECTION_NAME);
// Create a query against the collection.
        Query query=null;
        if (anneeConcert!=null&&anneeConcert.length()==4) {

                    anneeConcert=anneeConcert.substring(2,4);
                System.out.println("+++++++++++++++++++++" + anneeConcert);
            query = concerts.endAt("fields._1ere_date", anneeConcert).orderBy(FieldPath.documentId());
            //Query query  = concerts.whereEqualTo("fields.01-Dec-04", anneeConcert);

            }

// retrieve  query results asynchronously using query.get()
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
        if (documents.isEmpty()) {
            //System.out.println("++++++*******************************+++++++++++++++" + pays);
            LOGGER.info("TAG_MEDIUM_MYRICK_CHOW", "The document does not exist in the given collection");
            return null;
        } else {

            for (DocumentSnapshot document : documents) {
                System.out.println(document.getId());
                concert = document.toObject(Concert.class);
                ConcertsInfos.add(concert);
            }
            System.out.println("Edition:" + ConcertsInfos.get(0).getFields().getEdition());
            return ConcertsInfos;
        }


    }




    /*la selection d’un artiste pour afficher
    des informations supplémentaires (lieux, évènements dans
    lesquels il est apparu, dates, pays, etc)*/

/*
    public String updateConcertByArtist(String artiste) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(artiste.getFirstName()).set(artiste);
        System.out.println(artiste);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }*/

/*la possibilité de modifier ou de supprimer une entrée (une entrée étant un artiste pour l’année des
Transmusicales en cours)
*/

    }
