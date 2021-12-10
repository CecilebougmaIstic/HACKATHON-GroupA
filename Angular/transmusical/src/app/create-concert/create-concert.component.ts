import { Component, OnInit } from '@angular/core';
import {Concert} from '../model/concert'
import {ConcertService} from '../service/concert-service'
import {Router} from '@angular/router'

@Component({
  selector: 'app-create-concert',
  templateUrl: './create-concert.component.html',
  styleUrls: ['./create-concert.component.css']
})
export class CreateConcertComponent implements OnInit {

	concert:Concert;
	concertService:ConcertService;
	router:Router;

	
  constructor(private cS:ConcertService,r:Router) {
	this.concertService=cS;
	this.router=r;

}

  ngOnInit(): void {}

  onCreateConcert(){
	this.concertService.create(this.concert);
	console.log(this.concert);
	this.router.navigate(['/current-year']);
	}
}
