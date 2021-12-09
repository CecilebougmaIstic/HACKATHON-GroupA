package org.trans_hack.service.old;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.concurrent.ExecutionException;

//CRUD operations
//@Service
public class ArtistService {
    public static final String COLLECTION_NAME="artists";

   /* public String saveArtist(Artist artist) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
       ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(artist.getFirstName()).set(artist);
        System.out.println(artist);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }


    public Artist getArtistDetailsByFirstName(String firstName) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COLLECTION_NAME).document(firstName);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        Artist artist=null;
        if(document.exists()){
             artist = document.toObject(Artist.class);

        System.out.println(artist );
            return artist;
        }else{
            return null;
        }
    }


    public List<Artist> getArtistDetails() throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
       Iterable<DocumentReference> documentReference = dbFirestore.collection(COLLECTION_NAME).listDocuments();
       Iterator<DocumentReference> iterator =documentReference.iterator();
       List<Artist>listArtists = new ArrayList<Artist>();
        Artist artist=null;
        while(iterator.hasNext()){
            DocumentReference documentReference1 = iterator.next();
            ApiFuture<DocumentSnapshot> future = documentReference1.get();
            DocumentSnapshot document = future.get();
            artist = document.toObject(Artist.class);
            listArtists.add(artist);
            System.out.println(listArtists);
        }

return listArtists;

    }

    public String updateArtist(Artist artist) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(artist.getFirstName()).set(artist);
        System.out.println(artist);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }


    public String deleteArtist(String firstName) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(firstName).delete();
        System.out.println(firstName);
        return "The artist " + firstName +"has been deleted succesfully!";
    }


   /* public static <T> Map<String, T> toMapWithValues(Class<T> valueClass, DocumentSnapshot snapshot) {
        Map<String, T> result = new HashMap<>();
        for (String key : snapshot.getData().keys()) {
            T value = snapshot.get(Key, valueClass);
            result.put(key, value);7/
        }
        return result;
    }*/


}
