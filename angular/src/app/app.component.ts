import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Welcome to Angular FrameWork';
  binding ="a binding creates a live connection between a part of the UI created from a template (a DOM element, directive, or component) and the model (the component instance to which the template belongs).s "
  imageUrl= "..//src//assets//1.png";
  message="Two-way binding gives components in your application a way to share data"
  flag=false;
  exp="red"
  sale="";

  showMessage(){
    this.title="Buttton Clicked"
    this.flag=true
    this.exp="green"
    this.sale="sale"
  }

}
