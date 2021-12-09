import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { HistoricComponent } from './historic/historic.component';
import { CurrentYearComponent } from './current-year/current-year.component';
import { ListArtistsComponent } from './list-artists/list-artists.component';


const routes: Routes = [
	{ path: '', component: AccueilComponent},
	{ path: 'accueil', component: AccueilComponent},
	{ path: 'historic', component: HistoricComponent},
	{ path: 'current-year', component: CurrentYearComponent},
	{ path: 'list-artists', component: ListArtistsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
