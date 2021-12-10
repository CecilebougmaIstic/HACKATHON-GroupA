

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/fieldsBackUpL.dart'; // -L
import 'package:projetest/function.dart';

class Historique extends StatelessWidget{
  final String Title;

  const Historique({Key? key,required this.Title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final args = ModalRoute.of(context)!.settings.arguments;
    String annee = args.toString();
    print(annee);
    final artist = Provider.of<List<fieldsBackUpL>>(context); //-L
    return Scaffold(
      appBar: AppBar(
        title: const Text('Historique '),
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
                      title: Text(ar.date),
                      subtitle: Column(
                        children: <Widget>[
                          Text(ar.artistes),
                          Text(ar.edition),
                          Text(ar.annee.toString()),
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