// ignore_for_file: file_names, camel_case_types

import 'package:projetest/database/fieldsBackUp.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class backUps {
  List<fieldsBackUp> _fieldsList(QuerySnapshot? snapshot) {
    return snapshot!.docs.map((doc) {
      return fieldsBackUp(
        artistes: (doc.data() as dynamic)['artiste'] ?? "",
        edition: (doc.data() as dynamic)['edition'] ?? "",
        premiereDate: (doc.data() as dynamic)['1ereDate'] ?? "",
        premiereSalle: (doc.data() as dynamic)['1ereSalle'] ?? "",
        originePays1: (doc.data() as dynamic)['Pays'] ?? "",
        origineVille1: (doc.data() as dynamic)['Ville'] ?? "",
      );
    }).toList();
  }

  Stream<List<fieldsBackUp>> get getFiels {
    return FirebaseFirestore.instance
        .collection("artistes")
        .orderBy("artiste")
        .snapshots()
        .map(_fieldsList);
  }
}
