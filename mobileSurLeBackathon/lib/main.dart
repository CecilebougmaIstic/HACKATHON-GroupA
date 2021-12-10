import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/backUps.dart';
import 'package:projetest/database/fieldsBackUp.dart';

import 'PageAccueil.dart';
import 'database/backUps.dart';
import 'database/fieldsBackUp.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return FutureBuilder(
      future: Firebase.initializeApp(),
      builder: (context, snapshot) {
        if (snapshot.hasError) {
          return const Text("Error");
        }
        if (snapshot.connectionState == ConnectionState.done) {
          return StreamProvider<List<fieldsBackUp>>.value(
            value: backUps().getFiels,
            initialData: const [],
            child: MaterialApp(
              debugShowCheckedModeBanner: false,
              theme: ThemeData(
                primarySwatch: Colors.blue,
              ),
              home: const PageAccueil(
                title: '',
              ),
            ),
          );
        }
        return const Text(
          "Loading",
          textDirection: TextDirection.ltr,
        );
      },
    );
  }
}
