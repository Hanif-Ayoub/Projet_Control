import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {RadarService} from "../services/radar.service";

@Component({
  selector: 'app-add-radar',
  templateUrl: './add-radar.component.html',
  styleUrls: ['./add-radar.component.css']
})
export class AddRadarComponent {
  radarFormGroup!:FormGroup
  succes:boolean=false
  constructor(private fb:FormBuilder,public radarService:RadarService) {
  }
  ngOnInit(): void {
    this.radarFormGroup=this.fb.group({
      vitesseMax:this.fb.control(null,[Validators.required,Validators.min(100)]),
      longitude:this.fb.control(null,[Validators.required,Validators.min(100)]),
      latitude:this.fb.control(null,[Validators.required,Validators.min(100)]),
      state:this.fb.control(false,[Validators.required])
    })
    this.succes=false
  }

  handleAddRadar() {
    let radar=this.radarFormGroup.value
    console.log(radar)
    this.radarService.addNewRadar(radar).subscribe({
      next:(data)=>{
        this.radarFormGroup.reset()
        this.succes=true
      }
    })


  }

}
