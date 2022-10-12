import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RickmortyapiService } from '../rickmortyapi.service'
import { Router } from '@angular/router';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  id!: number;
  results: any;

  username = '';
  token : string | null | undefined;

  savedchar:any = null;

  constructor(private route: ActivatedRoute,
    private rickandmortyapi: RickmortyapiService,
    public router: Router, private tokenSvc: TokenStorageService) { }

  ngOnInit() {
    this.token = this.tokenSvc.getToken();
    this.username = this.tokenSvc.getUser();

    if (this.token == null)
    {
      this.token = "NOT_FOUND";
    }

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

  redirect() {
    setTimeout(() => 
        {
          this.router.navigate(['/home']);
        },
        2000);
  }
  
  savecharacter(): void {
  this.savedchar = null;

    this.savedchar = {
      "id": this.results.id,
      "name": (<HTMLInputElement>document.getElementById("name")).value,
      "status": (<HTMLInputElement>document.getElementById("status")).value,
      "species": (<HTMLInputElement>document.getElementById("species")).value,
      "gender": (<HTMLInputElement>document.getElementById("gender")).value,
      "origin": (<HTMLInputElement>document.getElementById("origin")).value,
      "image": (<HTMLInputElement>document.getElementById("image")).value
    };

    this.rickandmortyapi.put_character(this.savedchar, this.results.id).subscribe(value=>{
      this.router.navigate(['/characters']);
    }, error=>{// do something with error });

  });
  }

}
