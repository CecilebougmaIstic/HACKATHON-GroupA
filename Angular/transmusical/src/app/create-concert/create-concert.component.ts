import { Component, OnInit } from '@angular/core';
import {Concert} from '../model/concert'
import {ConcertService} from '../service/concert-service'

@Component({
  selector: 'app-create-concert',
  templateUrl: './create-concert.component.html',
  styleUrls: ['./create-concert.component.css']
})
export class CreateConcertComponent implements OnInit {

	concert:Concert;
	concertService:ConcertService;
	
  constructor(private cS:ConcertService) {
	this.concertService=cS;
}

  ngOnInit(): void {}

  onCreateConcert(){}
}
