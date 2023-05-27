import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {RadarService} from "../services/radar.service";
import {Radar} from "../model/radar.model";
import {AuthenticationService} from "../services/authentication.service";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-radar',
  templateUrl: './radar.component.html',
  styleUrls: ['./radar.component.css']
})
export class RadarComponent implements OnInit{
  radars! :Array<Radar>;
  errorMessage! :String;
  searchFormGroup! :FormGroup;

  constructor(private radarService:RadarService,private fb:FormBuilder,
              public authService: AuthenticationService,private router:Router,
              private http: HttpClient) {}
  ngOnInit():void {
    this.searchFormGroup=this.fb.group({
      keyword:this.fb.control(null)
    })
    this.getAllRadars()
  }

  getAllRadars(){

    this.http.get<Array<Radar>>('http://localhost:8082/radars').subscribe(
      (data)=>{
        this.radars=data;
        console.log("from s ",data)
      }
    )
/*    this.radarService.getAllRadars().subscribe(({
      next: (data)=>{
        this.radars=data
        console.log("from c ",data)
      }
    }))*/
  }

 handleDeleteRadar(r: Radar) {
    let conf=confirm("are you sure ?")
    if(!conf) return;
    this.radarService.deleteRadar(r.id).subscribe({
      next:(data)=>{
        let index=this.radars.indexOf(r)
        this.radars.splice(index,1)
      }
    })
  }


  handleSearchRadars() {
    let keyword=this.searchFormGroup.value.keyword
    this.radarService.searchRadars(keyword).subscribe({
      next:(data)=>{
        this.radars=data
      }
    })
  }

  handleNewRadar() {
    this.router.navigateByUrl("/admin/addRadar")
  }

  handleEditRadar(r: Radar) {
    this.router.navigateByUrl("/admin/editRadar/"+r.id)

  }

}
