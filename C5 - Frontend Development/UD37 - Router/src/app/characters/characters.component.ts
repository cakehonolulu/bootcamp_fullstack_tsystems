import { Component, OnInit } from '@angular/core';
import { RickmortyapiService } from '../rickmortyapi.service'

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrls: ['./characters.component.css']
})
export class CharactersComponent implements OnInit {
  
  results:any = null;

  constructor(private rickandmortyapi: RickmortyapiService) {}

  ngOnInit() {
    this.rickandmortyapi.get_api_results()
      .subscribe(
        result => this.results = result
      )
  }

  del(id: number) {
    this.rickandmortyapi.remove_character(id).subscribe(value=>{
      window.location.reload()
    }, error=>{// do something with error });

  });

  }
}
