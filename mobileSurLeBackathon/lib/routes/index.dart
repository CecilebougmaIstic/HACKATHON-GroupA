import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:projetest/PageAccueil.dart';
import 'package:projetest/PageArtistes.dart';
import 'package:projetest/PageCetteAnnee.dart';
import 'package:projetest/database/screens/historique.dart';

import '../PagePays.dart';

class RouteGenerator{

  static Route<dynamic> routes(RouteSettings settings) {
    switch (settings.name) {
      case '/':
          return MaterialPageRoute(builder: (_) => PageAccueil( title: 'pasge acceuil',));
      case '/historique':
        return MaterialPageRoute(builder: (_) =>  Historique(Title: 'historique',));
      case 'home_page':
        return MaterialPageRoute(builder: (_) =>  PageAccueil(title: 'PageAccueil',));
      case  'artists':
          return MaterialPageRoute(builder: (_) =>  PageArtiste(title: 'PageArtist',));
      case 'pagePays':
      return MaterialPageRoute(builder: (_) =>  PagePays(title: 'PagePays',));
      case 'pageCetteAnnee':
        return MaterialPageRoute(builder: (_)=> PageCetteAnnee(title: 'PagecetteAnnee'));
      default:
        return MaterialPageRoute(builder: (_) => PageAccueil(title: 'Page Acceuil'));

    }
  }}