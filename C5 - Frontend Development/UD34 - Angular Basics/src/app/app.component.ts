import { Component } from '@angular/core';

// Import MathJS
import { create, all } from 'mathjs'

const config = { }
const math = create(all, config)

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularCalculator';
  mathExpr: String = '0';
  result: String = '0';
  calculated: boolean = false;

  insert(value: any) {
    if (this.calculated) {
      this.clear()
      this.calculated = false;
    }
    
    if (this.mathExpr.charAt(0) == '0') {
      this.mathExpr = "";
      this.mathExpr += value;
    } else {
      this.mathExpr += value;
    }
  }

  delete() {
    if (this.calculated) {
      this.clear()
      this.calculated = false;
    }

    if (!(this.mathExpr.charAt(0) == '0')) {
      this.mathExpr = this.mathExpr.substring(0, this.mathExpr.length - 1);
    }
  }

  calculate() {
    if (this.mathExpr != '0') {
      // Evaluate using MathJS library
      this.result = math.evaluate(this.mathExpr.toString());
      this.calculated = true;
    }
  }

  clear() {
    this.result = '0';
    this.mathExpr = '0';
  }
}
