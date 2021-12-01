import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreationArtistComponent} from './creation-artist/creation-artist.component'
import {ListArtistComponent} from './list-artist/list-artist.component'
import {TestComponent} from './test/test.component'

const routes: Routes = [
	{ path: 'creationArtist', component: CreationArtistComponent},
	{ path: 'listArtist', component: ListArtistComponent},
	{ path: 'test', component: TestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
