import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {AdminTemplateComponent} from "./admin-template/admin-template.component";
import {AuthenticationGuard} from "./guards/authentication.guard";
import {RadarComponent} from "./radar/radar.component";
import {EditRadarComponent} from "./edit-radar/edit-radar.component";
import {AddRadarComponent} from "./add-radar/add-radar.component";
import {InfractionComponent} from "./infraction/infraction.component";
import {DashbordComponent} from "./dashbord/dashbord.component";

const routes: Routes = [
  {path:"login", component: LoginComponent},
  {path:"", component: LoginComponent},
  {path:"admin", component: AdminTemplateComponent,canActivate:[AuthenticationGuard],children:[
      {path:"dashbord", component: DashbordComponent},
      {path:"radars", component: RadarComponent},
      {path:"addRadar", component: AddRadarComponent},
      {path:"editRadar/:id", component: EditRadarComponent},
      {path:"infractions", component: InfractionComponent},
    ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
