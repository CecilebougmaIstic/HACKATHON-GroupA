import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'


@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {

  constructor(public r:Router) {
	this.router=r;
  }
  router:Router;

  ngOnInit(): void {
  }

  toMain(){
	this.router.navigate(['/accueil']);
  }
  toCurrentYear(){
	this.router.navigate(['/current-year']);
  }
  toHistoric(){
	this.router.navigate(['/historic']);
  }
  toArtists(){
	this.router.navigate(['/list-artists']);
  }

  toConnexion(){
	this.ngOnInit();
  }


}
