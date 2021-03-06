import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { HistoricComponent } from './historic/historic.component';
import { CurrentYearComponent } from './current-year/current-year.component';
import { ListArtistsComponent } from './list-artists/list-artists.component';
import { CreateConcertComponent } from './create-concert/create-concert.component';
import { ConnexionComponent } from './connexion/connexion.component';


const routes: Routes = [
	{ path: '', component: AccueilComponent},
	{ path: 'accueil', component: AccueilComponent},
	{ path: 'historic', component: HistoricComponent},
	{ path: 'current-year', component: CurrentYearComponent},
	{ path: 'list-artists', component: ListArtistsComponent},
	{ path: 'create-concert', component: CreateConcertComponent},
	{ path: 'connexion', component: ConnexionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
