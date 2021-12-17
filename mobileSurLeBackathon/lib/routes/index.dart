import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:projetest/PageAccueil.dart';
import 'package:projetest/PageArtistes.dart';
import 'package:projetest/PageCetteAnnee.dart';
import 'package:projetest/database/screens/historique.dart';
import 'package:projetest/database/screens/indirection.dart';

import '../PagePays.dart';

class RouteGenerator {
  static Route<dynamic> routes(RouteSettings settings) {
    switch (settings.name) {
      case '/':
        return MaterialPageRoute(
            builder: (_) => const PageAccueil(
                  title: 'pasge acceuil',
                ));
      case '/historique':
        return MaterialPageRoute(
            builder: (_) => Historique(
                Title: 'historique', message: settings.arguments.toString()));
      case '/home_page':
        return MaterialPageRoute(
            builder: (_) => const PageAccueil(
                  title: 'PageAccueil',
                ));
      case '/artists':
        return MaterialPageRoute(
            builder: (_) => const PageAccueil(
                  title: 'PageArtist',
                ));
      case '/pagePays':
        return MaterialPageRoute(
            builder: (_) => const PagePays(
                  title: 'PagePays',
                ));
      case '/pageCetteAnnee':
        return MaterialPageRoute(
            builder: (_) => const PageCetteAnnee(title: 'PagecetteAnnee'));
      case '/indirection':
        return MaterialPageRoute(
            builder: (_) => const Indirection(title: 'indirection'));

      default:
        return MaterialPageRoute(
            builder: (_) => const PageAccueil(title: 'Page Acceuil'));
    }
  }
}
