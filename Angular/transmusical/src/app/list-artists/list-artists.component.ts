import { Component, OnInit } from '@angular/core';
import {Artist} from '../model/artist'
import {ArtistService} from '../service/artist-service'
import {Router} from '@angular/router'

@Component({
  selector: 'app-list-artists',
  templateUrl: './list-artists.component.html',
  styleUrls: ['./list-artists.component.css']
})
export class ListArtistsComponent implements OnInit {
	
  artists:Artist[];
  artistService:ArtistService;
  router:Router;

  constructor(public aS:ArtistService,public r:Router) {
	this.artistService=aS;
	this.router=r;
	}

  ngOnInit(): void {
	this.artistService.findAll().subscribe(data => {
      console.log(data);
		this.artists = data;
    });
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
	this.ngOnInit();
  }

  toConnexion(){
	this.router.navigate(['/connexion']);	
  }


}
