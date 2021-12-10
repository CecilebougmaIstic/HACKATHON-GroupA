import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import {Transmusicale} from '../model/transmusicale'
import {TransmusicaleService} from '../service/transmusicale-service'



@Component({
  selector: 'app-historic',
  templateUrl: './historic.component.html',
  styleUrls: ['./historic.component.css']
})
export class HistoricComponent implements OnInit {
  router:Router;
  transmusicales:Transmusicale[];
  transmusicaleService:TransmusicaleService;


  constructor(public r:Router,public tS:TransmusicaleService) { 
	this.router=r;
	this.transmusicaleService=tS;
	}

  ngOnInit(): void {
/*	this.transmusicaleService.findAll().subscribe(data => {
      this.transmusicales = data;
    });
*/  }
  toMain(){
	this.router.navigate(['/accueil']);
  }
  toCurrentYear(){
	this.router.navigate(['/current-year']);
  }
  toHistoric(){
	this.ngOnInit();
  }
  toArtists(){
	this.router.navigate(['/list-artists']);
  }
  toConnexion(){
	this.router.navigate(['/connexion']);	
  }


}
