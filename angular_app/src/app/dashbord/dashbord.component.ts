import {Component, OnInit} from '@angular/core';
import {InfractionService} from "../services/infraction.service";
import {Infraction} from "../model/infraction.model";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-dashbord',
  templateUrl: './dashbord.component.html',
  styleUrls: ['./dashbord.component.css']
})
export class DashbordComponent implements OnInit{
  infractionNumber!:number;
  radarNumber!:number;
  constructor(private infractionService:InfractionService,private http: HttpClient) {
  }

  ngOnInit(): void {
    this.getNumbers();
  }
  getNumbers(){
      this.http.get<Array<Infraction>>('http://localhost:8083/infractions').subscribe(
        (data)=>{
          this.infractionNumber=data.length;
          console.log(this.infractionNumber)
        }
      )
    this.http.get<Array<Infraction>>('http://localhost:8082/radars').subscribe(
      (data)=>{
        this.radarNumber=data.length;
        console.log(this.radarNumber)
      }
    )
  }
}
