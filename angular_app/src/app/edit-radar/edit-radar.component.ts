import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {RadarService} from "../services/radar.service";
import {Radar} from "../model/radar.model";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-edit-radar',
  templateUrl: './edit-radar.component.html',
  styleUrls: ['./edit-radar.component.css']
})
export class EditRadarComponent {
  radarId!:number
  radar!:Radar
  radarFormGroup!:FormGroup
  constructor(private route:ActivatedRoute,public radarService:RadarService,
              private fb:FormBuilder,private router:Router,private http: HttpClient) {
    this.radarId=this.route.snapshot.params['id']
  }
  ngOnInit() {
    this.http.get<Radar>('http://localhost:8082/radars/'+this.radarId).subscribe(
      (data)=>{
        console.log(data)
        this.radar=data;
        this.radarFormGroup=this.fb.group({
          /*vitesseMax:this.fb.control(this.radar.vitesseMax,[Validators.required,Validators.min(100)]),
          longitude:this.fb.control(this.radar.longitude,[Validators.required,Validators.min(100)]),
          latitude:this.fb.control(this.radar.latitude,[Validators.required,Validators.min(100)]),
          state:this.fb.control(this.radar.state,[Validators.required])*/

          vitesseMax: [this.radar.vitesseMax, [Validators.required, Validators.min(100)]],
          longitude: [this.radar.longitude, [Validators.required, Validators.min(100)]],
          latitude: [this.radar.latitude, [Validators.required, Validators.min(100)]],
          state: [this.radar.state, [Validators.required]]
        })
      }
    )
  }

  handleEditRadar() {
    let r=this.radarFormGroup.value
    r.id=this.radarId
    this.radarService.updateRadar(r).subscribe({
      next:(data)=>{
        console.log()
        this.router.navigateByUrl("/admin/radars")
      }
    })
  }
}
