// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/fieldsBackUp.dart';
import 'package:projetest/function.dart';

class PageProfil extends StatelessWidget {
  const PageProfil({Key? key, required String title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final artist = Provider.of<List<fieldsBackUp>>(context);
    return Scaffold(
      appBar: AppBar(
        title: const Text('Page Profil'),
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
                      leading: const Icon(Icons.people),
                      title: Text(ar.artistes),
                      subtitle: Column(
                        children: <Widget>[
                          Text(ar.edition),
                          Text(ar.originePays1),
                          Text(ar.origineVille1),
                          Text(ar.premiereDate),
                          Text(ar.premiereSalle),
                        ],
                      ),
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                    ),
                  ],
                ),
              ),
            );
          }),
    );
  }
}
