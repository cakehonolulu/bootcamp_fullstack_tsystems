import { Component, OnInit } from '@angular/core';

import { Series } from '../models/series.model';

import { ApiService } from '../api.service';

import { Router } from '@angular/router';

const LOGGED = 'logged';

@Component({
  selector: 'app-series',
  templateUrl: './series.component.html',
  styleUrls: ['./series.component.css']
})
export class SeriesComponent implements OnInit {

  constructor(private apiSvc: ApiService, public router: Router) { }

  
  series: any = null;

  page: number = 1;

  isLoggedIn = false;

  ngOnInit(): void {
    if (window.sessionStorage.getItem(LOGGED) != null)
      {
        this.isLoggedIn = true;
        this.instancePage()
      }    
  }

  redirect() {
    setTimeout(() => 
        {
          this.router.navigate(['/home']);
        },
        2000);
  }

  instancePage() {
    this.apiSvc.getPopularSeries(this.page.toString())
    .subscribe(result => {
      this.series = result
    })
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
