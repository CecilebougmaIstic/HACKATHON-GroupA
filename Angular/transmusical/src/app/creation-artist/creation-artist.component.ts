import { Component, OnInit } from '@angular/core';
import {Artist} from "../model/artist";
import {ArtistService} from "../service/artist-service";

@Component({
  selector: 'app-creation-artist',
  templateUrl: './creation-artist.component.html',
  styleUrls: ['./creation-artist.component.css']
})
export class CreationArtistComponent implements OnInit {

  artist:Artist;

  constructor( private artisteService: ArtistService)
  {
    this.artist = new Artist();
  }


	onSubmit(){}

  ngOnInit(): void {
  }


}
