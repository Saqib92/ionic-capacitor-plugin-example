import { Component } from '@angular/core';
import Echo from '../plugin/plugin';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  int1: number = 0;
  int2: number = 0;
  answer: number;

  constructor(
  ) {}


  async getEchoCall(){
    let res = await Echo.echo({value: 'Hello World!'});
    console.log('Echo Response From Plugin', res);
  }


  async getSum(){
    let res = await Echo.sum({int1: this.int1, int2: this.int2});
    this.answer = res;
    console.log('Sum Response From Plugin', res);
  }

}
