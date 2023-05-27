import { Component } from '@angular/core';
import {Radar} from "../model/radar.model";
import {FormBuilder, FormGroup} from "@angular/forms";
import {RadarService} from "../services/radar.service";
import {AuthenticationService} from "../services/authentication.service";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {InfractionService} from "../services/infraction.service";
import {Infraction} from "../model/infraction.model";

@Component({
  selector: 'app-infraction',
  templateUrl: './infraction.component.html',
  styleUrls: ['./infraction.component.css']
})
export class InfractionComponent {
  infractions:Array<Infraction>=[];
  searchFormGroup! :FormGroup;
  errorMessage! :String;


  constructor(private infractionService:InfractionService,private fb:FormBuilder,
              public authService: AuthenticationService,private router:Router,
              private http: HttpClient) {}
  ngOnInit():void {
    this.searchFormGroup=this.fb.group({
      keyword:this.fb.control(null)
    })
    this.getAllInfractions()
  }

  getAllInfractions(){

    this.http.get<Array<Infraction>>('http://localhost:8083/infractions').subscribe(
      (data)=>{
        this.infractions=data;
        console.log("from s ",data)
      }
    )
  }

  handleDeleteInfraction(i: Infraction) {
    let conf=confirm("are you sure ?")
    if(!conf) return;
    this.infractionService.deleteInfraction(i.id).subscribe({
      next:(data)=>{
        let index=this.infractions.indexOf(i)
        this.infractions.splice(index,1)
      }
    })
  }


  handleSearchInfraction() {
    let keyword=this.searchFormGroup.value.keyword
    this.infractionService.searchInfraction(keyword).subscribe({
      next:(data)=>{
        this.infractions=data
      }
    })
  }
}
