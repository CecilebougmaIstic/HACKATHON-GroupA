import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import {Concert} from '../model/concert'
import {ConcertService} from '../service/concert-service'


@Component({
  selector: 'app-current-year',
  templateUrl: './current-year.component.html',
  styleUrls: ['./current-year.component.css']
})
export class CurrentYearComponent implements OnInit {
  router:Router;
  concerts:Concert[];
  concertService:ConcertService;

  constructor(public r:Router,public cS:ConcertService) {
	this.router=r;
	this.concertService=cS;
  }

  ngOnInit(): void {
	this.concertService.findAll().subscribe(data => {
      this.concerts = data;
		console.log(data);
    });
  }
  toMain(){
	this.router.navigate(['/accueil']);
  }
  toCurrentYear(){
	this.ngOnInit();
  }
  toHistoric(){
	this.router.navigate(['/historic']);
  }
  toArtists(){
	this.router.navigate(['/list-artists']);
  }
  toConnexion(){
	this.router.navigate(['/connexion']);	
  }

  createConcert(){
	this.router.navigate(['/create-concert']);
  }

	delete(){}
	update(){}


}
