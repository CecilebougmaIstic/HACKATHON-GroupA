// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/fieldsBackUpL.dart'; // -L
import 'package:projetest/function.dart';

import 'PageProfil.dart';

class PageAccueil extends StatelessWidget {
  const PageAccueil({Key? key, required String title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final artist = Provider.of<List<fieldsBackUpL>>(context); // -L
    return Scaffold(
      appBar: AppBar(
        title: const Text('Accueil'),
      ),
      drawer: getDraw(context),
      body: ListView.builder(
          itemCount: artist.length,
          itemBuilder: (context, index) {
            final ar = artist[index];
            return Center(
              child: Card(
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: <Widget>[
                    ListTile(
                      leading: const Icon(Icons.album),
                      title: Text(ar.artistes),
                      //subtitle: Text(ar.premiereDate), //-L
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                      children: <Widget>[
                        TextButton(
                          child: const Text('Profil'),
                          onPressed: () {
                            Navigator.push(
                              context,
                              MaterialPageRoute(
                                  builder: (_) => PageProfil(
                                        title: 'title',
                                        artistes: ar.artistes,
                                      )),
                            );
                          },
                        ),
                        const SizedBox(width: 8),
                      ],
                    ),
                  ],
                ),
              ),
            );
          }),
    );
  }
}
