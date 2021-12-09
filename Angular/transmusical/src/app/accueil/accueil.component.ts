import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {

  router:Router;
c=true;

  constructor(public r:Router) { 
	this.router=r;
}

  ngOnInit(): void {
	this.c=true;
	
	}

  toMain(){
	this.c=true;	
	console.log("accueil");
	this.ngOnInit();
  }
  toCurrentYear(){
	this.c=false;
	this.router.navigate(['/current-year']);
  }
  toHistoric(){
	this.c=false;
	this.router.navigate(['/historic']);
  }
  toArtists(){
	this.c=false;
	this.router.navigate(['/list-artists']);
  }


}
