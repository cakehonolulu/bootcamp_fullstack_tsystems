import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'Task1';

  temporal: Array<object> = [];

  public form: FormGroup;
  name: string = '';
  ssn: string = '';
  address: string = '';
  group: string = '';

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      name: '',
      ssn: '',
      address: '',
      group: ''
    })
  }

  save() {
    this.name = this.form.get('name')?.value;
    this.ssn = this.form.get('ssn')?.value;
    this.address = this.form.get('address')?.value;
    this.group = this.form.get('group')?.value;

    this.temporal.push({
      name: this.name,
      ssn: this.ssn,
      address: this.address,
      group: this.group
    })
  }
}
