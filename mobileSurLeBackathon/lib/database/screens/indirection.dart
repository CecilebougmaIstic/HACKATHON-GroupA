// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../../function.dart';

class Indirection extends StatelessWidget {
  const Indirection({Key? key, required String title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Artistes'),
        foregroundColor: Colors.white,
        backgroundColor: Colors.grey,
      ),
      drawer: getDraw(context),
      body: Center(
        child: ListView(children: [
          Card(
            margin: const EdgeInsets.all(10),
            color: Colors.grey[100],
            shadowColor: Colors.black,
            elevation: 10,
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children:  <Widget>[
               const ListTile(
                  title: Text(
                    "Annee",
                    style:
                    TextStyle(fontSize: 30, fontWeight: FontWeight.bold),

                  ),

                ),
                ListTile(
                  leading: Icon(Icons.album, color: Colors.red, size: 45),
                  title: const Text(
                    "2018",
                    style: TextStyle(fontSize: 20),
                  ),
                  onTap: () => Navigator.pushNamed(context, '/historique',arguments: "2018"),
                ),
                ListTile(
                  leading: Icon(Icons.album, color: Colors.grey, size: 45),
                  title: const Text(
                    "2017",
                    style:  TextStyle(fontSize: 20),
                  ),
                  onTap: () => Navigator.pushNamed(context, '/historique',arguments: "2017"),
                ),
                ListTile(
                  leading: Icon(Icons.album, color: Colors.black, size: 45),
                  title: const Text(
                    "2016",
                    style: TextStyle(fontSize: 20),
                  ),
                  onTap: () => Navigator.pushNamed(context, '/historique',arguments: "2016"),
                ),
              ],
            ),
          ),
        ]),
      ),
    );
  }
}
