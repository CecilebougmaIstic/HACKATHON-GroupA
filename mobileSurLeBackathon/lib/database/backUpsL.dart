// ignore_for_file: file_names, camel_case_types

import 'package:projetest/database/fieldsBackUpL.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class backUpsL {
  List<fieldsBackUpL> _fieldsList(QuerySnapshot? snapshot) {
    return snapshot!.docs.map((doc) {
      return fieldsBackUpL(
        artistes: (doc.data() as dynamic)['artistes'] ?? "",
        annee: (doc.data() as dynamic)['annee'] ?? "",
        date: (doc.data() as dynamic)['date'] ?? "",
        deezer: (doc.data() as dynamic)['deezer'] ?? "",
        edition: (doc.data() as dynamic)['edition'] ?? "",
        id: (doc.data() as dynamic)['id'] ?? "",
        pays: (doc.data() as dynamic)['pays'] ?? "",
        salle: (doc.data() as dynamic)['salle'] ?? "",
        spotify: (doc.data() as dynamic)['spotify'] ?? "",
        ville: (doc.data() as dynamic)['ville'] ?? "",
      );
    }).toList();
  }

  Stream<List<fieldsBackUpL>> get getFiels {
    return FirebaseFirestore.instance
        .collection("hackedition")
        .orderBy("artistes")
        .snapshots()
        .map(_fieldsList);
  }
}
