import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Task2';

  results: Array<object> = [];
  captchaValidator: any = null;
  emailValidator: any = null;
  validator: boolean = false;

  public  form: FormGroup;
  name: string = '';
  email: string = '';
  message: string = '';
  captcha: string = '';

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      name: '',
      email: '',
      message: '',
      captcha: ''
    })
  }

  validate() {

    var emailRegex = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/

    if (this.email.match(emailRegex)) {
      this.emailValidator = true
    } else {
      this.emailValidator = false
    }

    if (this.captcha == '5') {
      this.captchaValidator = true
    } else {
      this.captchaValidator = false
    }

    if (this.emailValidator && this.captchaValidator) {
      this.validator = true
    }
  }

  save() {
    this.name = this.form.get('name')?.value;
    this.email = this.form.get('email')?.value;
    this.message = this.form.get('message')?.value;
    this.captcha = this.form.get('captcha')?.value;

    this.validate()

    if(this.validator) {
      this.results.push({
        name: this.name,
        email: this.email,
        message: this.message,
        captcha: this.captcha
      })
    }
  }
}
