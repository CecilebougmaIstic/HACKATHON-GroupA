import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:projetest/PageCetteAnnee.dart';
import 'package:projetest/PagePays.dart';

import 'PageAccueil.dart';
import 'PageAnnee.dart';
import 'PageArtistes.dart';

Drawer getDraw(context) {
  return Drawer(
    child: ListView(
      padding: EdgeInsets.zero,
      children: [
        Container(
          decoration: BoxDecoration(
            color: Colors.black,
            border: Border.all(
              width: 0,
            ),
          ),
          child: const Image(
            image: AssetImage("images/transm.jpeg"),
            //height: 180,
          ),
        ),
        const ListTile(
          title: Text(
            "Catégories",
            style: TextStyle(fontWeight: FontWeight.bold, fontSize: 15),
          ),
          /*     onTap: () {
                Navigator.pop(context); */
          // },
        ),
        ListTile(
          title: const Text('Accueil'),
          onTap: () {
            // Navigator.pop(context);
            Navigator.pushNamed(
                context,
                '/homepage');
          },
        ),
        ListTile(
          title: const Text('Artistes'),
          onTap: () {
            // Navigator.pop(context);
            Navigator.pushNamed(
                context,
                '/artists');
          },
        ),
        ListTile(
          title: const Text("Pays d'origine"),
          onTap: () {
            // Navigator.pop(context);
            Navigator.pushNamed(
                context,
                '/pagePays');
          },
        ),
        ListTile(
          title: const Text('Historique'),
          onTap: () {
            // Navigator.pop(context);
            Navigator.pushNamed(
                context,
                '/indirection');
          },
        ),
        ListTile(
          title: const Text('Cette Année'),
          onTap: () {
            // Navigator.pop(context);
            Navigator.pushNamed(
                context,
                '/pageCetteAnnee');
          },
        ),
      ],
    ),
  );
}

// Faire fonction par rapport au listView builder et les design de base de chaque page (BoxDeco)