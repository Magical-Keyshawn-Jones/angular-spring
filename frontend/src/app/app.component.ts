import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less'],
})
export class AppComponent {
  // title = 'frontend';
  title = 'Dababy';
  constructor(private http: HttpClient) {
    this.http.get('http://localhost:8080/yes').subscribe(data => {
      console.log(data)
    })
  }
}
