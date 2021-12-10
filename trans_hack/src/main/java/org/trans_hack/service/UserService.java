package org.trans_hack.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.cloud.FirestoreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.trans_hack.model.Concert;
import org.trans_hack.model.User;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {
    public static final String COLLECTION_NAME = "users";

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    /*Api de connexion qui retourne un utilisateur si il existe en base*/
    public User  loginUser(String email, String password) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference docRef = dbFirestore.collection(COLLECTION_NAME).document(email);
        // asynchronously retrieve the document
        ApiFuture<DocumentSnapshot> future = docRef.get();
        // block on response
        DocumentSnapshot document = future.get();
        User user = null;
        if (document.exists()) {
            // convert document to POJO
            user = document.toObject(User.class);
            System.out.println("**************************************"+password);
            if(user.getPassWord().equals(password)){
                System.out.println("----------------------"+user.getPassWord());
                return user;
            }else{
                user =null;
                LOGGER.info("TAG_MEDIUM_MYRICK_CHOW", "Authentification failled!");}

        } else {
            System.out.println("No such document!");
        }
        return user;
    }
    public String saveUser(User user) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(user.getEmail()).set(user);
        System.out.println(user);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
    public String updateUser(User user) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(user.getEmail()).set(user);
        System.out.println(user);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }


    public String deleteUser(String email) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(email).delete();
        System.out.println(email);
        return "The artist " + email +"has been deleted succesfully!";
    }

}