// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import 'function.dart';

class PageAnnee extends StatelessWidget {
  const PageAnnee({Key? key, required String title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Année Précédente'),
      ),
      drawer: getDraw(context),
      body: Center(
        child: ListView(children: [
          Container(
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                begin: Alignment.topRight,
                end: Alignment.bottomLeft,
                colors: [
                  Colors.black,
                  Colors.grey,
                  Colors.red,
                ],
              ),
            ),
            child: Card(
              margin: const EdgeInsets.all(10),
              color: Colors.grey[100],
              shadowColor: Colors.black,
              elevation: 10,
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: const <Widget>[
                  ListTile(
                    title: Text(
                      "Hi",
                      style:
                          TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
                    ),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.red, size: 45),
                    title: Text(
                      "2001",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('23ème édition'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.grey, size: 45),
                    title: Text(
                      "2002",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('24ème édition'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.black, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.grey, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.red, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.grey, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.black, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.red, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.repeat_on_outlined,
                        color: Colors.grey, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                ],
              ),
            ),
          ),
        ]),
      ),
    );
  }
}