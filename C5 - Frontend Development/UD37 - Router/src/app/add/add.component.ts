import { Component, OnInit } from '@angular/core';
import { RickmortyapiService } from '../rickmortyapi.service'
import { Router } from '@angular/router';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  newcharacter:any = null;

  constructor(private rickandmortyapi: RickmortyapiService,
    public router: Router) {}

  ngOnInit(): void {
  }

  addcharacter(): void {
    this.newcharacter = null;

    this.newcharacter = {
      "name": (<HTMLInputElement>document.getElementById("name")).value,
      "status": (<HTMLInputElement>document.getElementById("status")).value,
      "species": (<HTMLInputElement>document.getElementById("species")).value,
      "gender": (<HTMLInputElement>document.getElementById("gender")).value,
      "origin": (<HTMLInputElement>document.getElementById("origin")).value,
      "image": (<HTMLInputElement>document.getElementById("image")).value
    };

    this.rickandmortyapi.post_character(this.newcharacter).subscribe(value=>{
      this.router.navigate(['/characters']);
    }, error=>{// do something with error });

  });
  }
} 
