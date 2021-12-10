import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:projetest/PageAccueil.dart';
import 'package:projetest/database/screens/historique.dart';

class RouteGenerator{

  static Route<dynamic> routes(RouteSettings settings) {
    switch (settings.name) {
      case '/':
          return MaterialPageRoute(builder: (_) => PageAccueil( title: 'pasge acceuil',));
      case '/historique':
        return MaterialPageRoute(builder: (_) =>  Historique(Title: 'historique',));
      default:
        return MaterialPageRoute(builder: (_) => PageAccueil(title: 'Page Acceuil'));

    }
  }}