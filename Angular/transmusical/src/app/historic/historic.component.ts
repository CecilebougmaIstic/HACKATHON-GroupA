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

  constructor(private  r:Router,private tS:TransmusicaleService) { 
	this.transmusicaleService=tS;	
  }

  ngOnInit(): void {
	this.transmusicaleService.findAll().subscribe(data => {
      this.transmusicales = data;
    });
  }
  toMain(){
	this.router.navigate(['accueil']);
  }
  toCurrentYear(){
	this.router.navigate(['current-year']);
  }
  toHistoric(){
	this.ngOnInit();
  }

}
