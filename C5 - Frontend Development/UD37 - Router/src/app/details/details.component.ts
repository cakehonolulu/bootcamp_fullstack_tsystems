import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RickmortyapiService } from '../rickmortyapi.service'

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id!: number;
  results: any;

  constructor(private route: ActivatedRoute,
              private rickandmortyapi: RickmortyapiService) { }

  ngOnInit() {
    this.route.queryParams
      .subscribe(params => {
        this.id = params['id'];
      }
    );

    this.rickandmortyapi.get_x_api_results(this.id)
    
      .subscribe(
        result => this.results = result
      )
  }

}
