import { Component, OnInit } from '@angular/core';
import { RickmortyapiService } from '../rickmortyapi.service'
import { TokenStorageService } from '../_services/token-storage.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  newcharacter:any = null;

  username = '';
  token : string | null | undefined;

  roles: string | undefined;


  constructor(private rickandmortyapi: RickmortyapiService,
    public router: Router, private tokenSvc: TokenStorageService) {}

  ngOnInit(): void {
    this.token = this.tokenSvc.getToken();
    this.username = this.tokenSvc.getUser();

    if (this.token == null)
    {
      this.token = "NOT_FOUND";
    }
    else
    {
      this.roles = this.tokenSvc.getRoles()?.toString().replace(/['"]+/g, '');
    }
  }

  redirect() {
    setTimeout(() => 
        {
          this.router.navigate(['/home']);
        },
        2000);
  }
  
  redirectUnpriv() {
    setTimeout(() => 
        {
          this.router.navigate(['/characters']);
        },
        2000);
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
