import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'package:projetest/routes/index.dart';
import 'package:provider/provider.dart';
import 'package:projetest/database/backUpsL.dart'; //-L
import 'package:projetest/database/fieldsBackUpL.dart'; //-L

import 'database/backUpsL.dart'; //-L
import 'database/fieldsBackUpL.dart'; //-L

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
          return StreamProvider<List<fieldsBackUpL>>.value(
            //-L
            value: backUpsL().getFiels, // -L
            initialData: const [],
            child: MaterialApp(
              debugShowCheckedModeBanner: false,
              theme: ThemeData(
                primarySwatch: Colors.red,
              ),
              initialRoute: '/',
              onGenerateRoute: RouteGenerator.routes,
              /* home: const PageAccueil(
                title: '',
              ),*/
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
