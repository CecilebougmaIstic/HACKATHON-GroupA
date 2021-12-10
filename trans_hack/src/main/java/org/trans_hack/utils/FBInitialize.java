package org.trans_hack.utils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class FBInitialize {
/*
    @PostConstruct
    public void initialize() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("path/to/serviceAccountKey.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://trans-back-end-default-rtdb.europe-west1.firebasedatabase.app")
                    .build();

            FirebaseApp.initializeApp(options);

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
@Autowired
ResourceLoader resourceLoader;
    @PostConstruct
    public void initialize() {
        Resource serviceAccount = resourceLoader.getResource("classpath:serviceAccountKey.json");

        InputStream input;

        {
            try {
                input = serviceAccount.getInputStream();
                File file = serviceAccount.getFile();
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(input))
                        .setDatabaseUrl("https://trans-back-end-default-rtdb.europe-west1.firebasedatabase.app")
                        .build();

                FirebaseApp.initializeApp(options);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
