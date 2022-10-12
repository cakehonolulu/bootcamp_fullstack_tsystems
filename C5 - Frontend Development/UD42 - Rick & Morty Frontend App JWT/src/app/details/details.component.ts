import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RickmortyapiService } from '../rickmortyapi.service'
import { Router } from '@angular/router';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id!: number;
  results: any;
  username = '';
  token : string | null | undefined;

  roles: string | undefined;
  
  constructor(private route: ActivatedRoute,
              private rickandmortyapi: RickmortyapiService, public router: Router,
              private tokenSvc: TokenStorageService,) { }

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

}
