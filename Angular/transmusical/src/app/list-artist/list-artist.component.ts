import { Component, OnInit } from '@angular/core';
import {ArtistService} from "../service/artist-service";
import {Artist} from "../model/artist";


@Component({
  selector: 'app-list-artist',
  templateUrl: './list-artist.component.html',
  styleUrls: ['./list-artist.component.css']
})
export class ListArtistComponent implements OnInit {
	
	artists:Artist[];
	artistService:ArtistService;

	
	
  constructor(public aS:ArtistService) {
	this.artistService=aS;
 }

  ngOnInit(): void {
	this.artistService.findAll().subscribe(data => {
      this.artists = data;
    })

  }
	
	onDelete(id:number){
	}
	
	onModify(id:number){
	}
}
