// ignore_for_file: file_names

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: '',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.red,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: const MyHage(),
    );
  }
}

class MyHage extends StatelessWidget {
  const MyHage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('TransHack'),
      ),
      drawer: Drawer(
        child: ListView(
          // Important: Remove any padding from the ListView.
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
              title: const Text('Artistes'),
              onTap: () {
                Navigator.pop(context);
              },
            ),
            ListTile(
              title: const Text("Pays d'origine"),
              onTap: () {
                Navigator.pop(context);
              },
            ),
            ListTile(
              title: const Text('Année'),
              onTap: () {
                Navigator.pop(context);
              },
            ),
            ListTile(
              title: const Text('Date'),
              onTap: () {
                Navigator.pop(context);
              },
            ),
          ],
        ),
      ),
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
                      "Concert du Jour",
                      style:
                          TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
                    ),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.red, size: 45),
                    title: Text(
                      "Let's Talk About Love",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Modern Talking Album'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.grey, size: 45),
                    title: Text(
                      "Bob Marley",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('No Woman, No Cry'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.black, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.grey, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.red, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.grey, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.black, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.red, size: 45),
                    title: Text(
                      "Jean Jacques Goldman",
                      style: TextStyle(fontSize: 20),
                    ),
                    subtitle: Text('Je marche seul'),
                  ),
                  ListTile(
                    leading: Icon(Icons.album, color: Colors.grey, size: 45),
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
