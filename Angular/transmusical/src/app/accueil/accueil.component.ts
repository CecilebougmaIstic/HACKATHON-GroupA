import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {

  router:Router;

  constructor(private r:Router) { 
	this.router=r;
  }

  ngOnInit(): void {}

  toMain(){
	this.ngOnInit();
  }
  toCurrentYear(){
	this.router.navigate(['current-year']);
  }
  toHistoric(){
	this.router.navigate(['historic']);
  }

}
