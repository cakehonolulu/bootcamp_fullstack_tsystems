import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'result-table',
  templateUrl: './results.component.html',
  styleUrls: ['./results.component.css']
})
export class ResultsComponent implements OnInit {

  constructor() { }

  @Input() results: any;

  ngOnInit(): void {
  }

}
