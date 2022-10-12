import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ProfileComponent } from './profile/profile.component';

import { FilmsComponent } from './films/films.component'
import { FilmsDetailsComponent } from './films-details/films-details.component'

import { SeriesComponent } from './series/series.component';
import { SeriesDetailsComponent } from './series-details/series-details.component';


const routes: Routes = [
  {
    path: '', redirectTo: '/home', pathMatch: 'full'
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'about',
    component: AboutComponent
  },
  {
    path: 'profile',
    component: ProfileComponent
  },
  {
    path: 'films',
    component: FilmsComponent
  },
  {
    path: 'series',
    component: SeriesComponent
  },
  {
    path: 'series/:id',
    component: SeriesDetailsComponent
  },
  {
    path: 'films/:id',
    component: FilmsDetailsComponent
  }
];

@NgModule({
  
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
