package org.trans_hack.utils;

import org.trans_hack.model.Artiste;

import java.util.List;
import java.util.UUID;

public class Utils {
    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
       return uuid.toString();
    }

    public static String convertDateToFireFormat(String date) {
        String dat=null;
        date=date.replace("-12-","-Dec-");
        date=date.replace("-11-","-Nov-");
        date=date.replace("-10-","-Oct-");
        date=date.replace("-09-","-Sept-");
        date=date.replace("-08-","-Aout-");
        date=date.replace("-07-","-Juil-");
        date=date.replace("-06-","-Jun-");
        date=date.replace("-05-","-Mai-");
        date=date.replace("-04-","-Avr-");
        date=date.replace("-03-","-Mar-");
        date=date.replace("-02-","-Fev-");
        date=date.replace("-01-","-Jav-");
        return date;
    }


    public static boolean testListContainArtiste(final List<Artiste> list, final String nomArtiste){
        return list.stream().anyMatch(o -> o.getNomGroupe().equals(nomArtiste));
    }
}
