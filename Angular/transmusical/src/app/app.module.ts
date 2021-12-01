import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';

import { ArtistService } from './service/artist-service'
import { CreationArtistComponent } from './creation-artist/creation-artist.component';
import { ListArtistComponent } from './list-artist/list-artist.component';
import { MessageToMobileComponent } from './message-to-mobile/message-to-mobile.component';
import { TestComponent } from './test/test.component';


@NgModule({
  declarations: [
    AppComponent,
    CreationArtistComponent,
    ListArtistComponent,
    MessageToMobileComponent,
    TestComponent,
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
    CreationArtistComponent,
    ListArtistComponent,
    MessageToMobileComponent,    
    TestComponent,
  ],

  providers: [ArtistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
