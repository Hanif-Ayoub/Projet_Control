import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import {ReactiveFormsModule} from "@angular/forms";
import { LoginComponent } from './login/login.component';
import { AdminTemplateComponent } from './admin-template/admin-template.component';
import {AuthenticationService} from "./services/authentication.service";
import { RadarComponent } from './radar/radar.component';
import { AddRadarComponent } from './add-radar/add-radar.component';
import {EditRadarComponent} from "./edit-radar/edit-radar.component";
import { VehiculeComponent } from './vehicule/vehicule.component';
import { OwnerComponent } from './owner/owner.component';
import { InfractionComponent } from './infraction/infraction.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminTemplateComponent,
    RadarComponent,
    AddRadarComponent,
    EditRadarComponent,
    VehiculeComponent,
    OwnerComponent,
    InfractionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [AuthenticationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
