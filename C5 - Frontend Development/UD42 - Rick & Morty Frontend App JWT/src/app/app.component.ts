import { Component } from '@angular/core';

import { AuthService } from './_services/auth.service';
import { TokenStorageService } from './_services/token-storage.service';

import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RickAndMorty';

  isLoginFailed = false;
  isLoggedInView = false;
  errorMessage = '';

  roles: string | undefined;


  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  usernameView?: string;

  form: any = {
    username: null,
    password: null
  };

  constructor(private authService: AuthService, private tokenStorageService: TokenStorageService,
     public router: Router) {
  }

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();
    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      const token = this.tokenStorageService.getToken();
      this.usernameView = JSON.stringify(user).replace(/['"]+/g, ''); // faig un regex per treure-li les cometes
      this.roles = this.tokenStorageService.getRoles()?.toString().replace(/['"]+/g, '');
    }

  }

  onSubmit(): void {
    this.authService.login(this.form.username, this.form.password).subscribe(
      data => {
        this.usernameView = this.form.username;
        this.isLoggedInView = true;

        

          this.tokenStorageService.saveToken(data["token"]);
          this.tokenStorageService.saveUser(this.form.username);
  

          setTimeout(() => 
          {
            this.usernameView = this.form.username;
    
            this.isLoginFailed = false;
            this.isLoggedIn = true;

            window.location.reload();
          },
          2000);

        },
      err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
      }
    )
  }
  
  logout(): void {
    this.tokenStorageService.signOut();
    this.isLoggedIn = false;
    this.roles = '';
    this.router.navigate(['/home']);
  }
}
