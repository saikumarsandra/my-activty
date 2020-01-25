import { Component, OnInit } from '@angular/core';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';

@Component({
  selector: 'calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent {
number1:number;
number2:number;
result:number;
savedata(num1:HTMLInputElement,num2:HTMLInputElement)
{
  this.number1=parseInt(num1.value);
  this.number2=parseInt(num2.value);
 this.result=(this.number1+this.number2);
}

}