// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/fieldsBackUp.dart';
import 'package:projetest/function.dart';

class PageAccueil extends StatelessWidget {
  const PageAccueil({Key? key, required String title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final artist = Provider.of<List<fieldsBackUp>>(context);
    return Scaffold(
      appBar: AppBar(
        title: const Text('Accueil'),
      ),
      drawer: getDraw(context),
      body: Center(
          child: ListView.builder(
        itemCount: artist.length,
        itemBuilder: (context, index) {
          final ar = artist[index];
          return Text(ar.artistes);
        },
      )),
    );
  }
}
