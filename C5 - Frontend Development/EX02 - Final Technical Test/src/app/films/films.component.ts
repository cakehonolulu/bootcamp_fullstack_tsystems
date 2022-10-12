import { Component, OnInit } from '@angular/core';

import { Films } from '../models/films.model';

import { ApiService } from '../api.service';

import { Router } from '@angular/router';

const LOGGED = 'logged';

@Component({
  selector: 'app-films',
  templateUrl: './films.component.html',
  styleUrls: ['./films.component.css']
})
export class FilmsComponent implements OnInit {

  constructor(private apiSvc: ApiService, public router: Router) { }

  movies: any = null;

  page: number = 1;

  isLoggedIn = false;

  ngOnInit(): void {
    if (window.sessionStorage.getItem(LOGGED) != null)
      {
        this.isLoggedIn = true;
        this.instancePage()
      }

    
  }

  instancePage() {
    this.apiSvc.getPopularMovies(this.page.toString())
    .subscribe(result => {
      this.movies = result
    })
  }

  redirect() {
    setTimeout(() => 
        {
          this.router.navigate(['/home']);
        },
        2000);
  }

  previousPage() {
    if (this.page > 0) {
      this.page--; 
    }
    this.instancePage()
  }

  nextPage() {
    this.page++
    this.instancePage()
  }

  setPage(page: any) {
    this.page = page
    this.instancePage()
  }
}
