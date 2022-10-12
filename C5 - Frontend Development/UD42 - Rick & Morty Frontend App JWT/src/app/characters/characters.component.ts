import { Component, OnInit } from '@angular/core';
import { RickmortyapiService } from '../rickmortyapi.service'
import { TokenStorageService } from '../_services/token-storage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrls: ['./characters.component.css']
})
export class CharactersComponent implements OnInit {
  
  results:any = null;

  username = '';
  token : string | null | undefined;

  roles: string | undefined;
  
  constructor(private rickandmortyapi: RickmortyapiService,
        private tokenSvc: TokenStorageService, public router: Router) {}

  ngOnInit() {
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

    this.rickandmortyapi.get_api_results()
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

  del(id: number) {
    this.rickandmortyapi.remove_character(id).subscribe(value=>{
      window.location.reload()
    }, error=>{// do something with error });

  });

  }
}
