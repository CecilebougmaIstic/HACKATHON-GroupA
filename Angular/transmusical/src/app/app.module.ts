import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';

import { MessageToMobileComponent } from './message-to-mobile/message-to-mobile.component';
import { TestComponent } from './test/test.component';
import { CreationEvenementComponent } from './creation-evenement/creation-evenement.component';
import { InscriptionUtilisateurComponent } from './inscription-utilisateur/inscription-utilisateur.component';
import { AccueilComponent } from './accueil/accueil.component';
import { CreateConcertComponent } from './create-concert/create-concert.component';
import { HistoricComponent } from './historic/historic.component';
import { CurrentYearComponent } from './current-year/current-year.component';
import { ListArtistsComponent } from './list-artists/list-artists.component';
import {ArtistService} from './service/artist-service'
import {ConcertService} from './service/concert-service'
import {TransmusicaleService} from './service/transmusicale-service'



@NgModule({
  declarations: [
    AppComponent,
    MessageToMobileComponent,
    TestComponent,
    CreationEvenementComponent,
    InscriptionUtilisateurComponent,
    AccueilComponent,
    CreateConcertComponent,
    HistoricComponent,
    CurrentYearComponent,
    ListArtistsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	HttpClientModule,
	ReactiveFormsModule,
	FormsModule,
  ],
  exports:[
    AppComponent,
    MessageToMobileComponent,    
    TestComponent,

  ],

  providers: [ArtistService,ConcertService,TransmusicaleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
