import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// This will allow server communication from every because it's in this module
import { HttpClientModule } from '@angular/common/http';
import { TestingAngularComponent } from './testing-angular/testing-angular.component';

// This is the main app
@NgModule({
  declarations: [
    AppComponent,
    TestingAngularComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
