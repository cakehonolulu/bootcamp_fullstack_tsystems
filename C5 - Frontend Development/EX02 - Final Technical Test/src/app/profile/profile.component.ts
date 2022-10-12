import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../_services/token-storage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  roles: string | undefined;

  username = '';
  token : string | null | undefined;

  constructor(private tokenSvc: TokenStorageService, public router: Router) { }

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

}
