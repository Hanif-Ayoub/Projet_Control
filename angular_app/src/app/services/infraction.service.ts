import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {Radar} from "../model/radar.model";
import {Infraction} from "../model/infraction.model";

@Injectable({
  providedIn: 'root'
})
export class InfractionService {
  infractions!:Array<Infraction>

  constructor(private http: HttpClient) {
    this.http.get<Array<Infraction>>('http://localhost:8083/infractions').subscribe(
      (data)=>{
        this.infractions=data;
        console.log("from s ",data)
      }
    )
  }


  public deleteInfraction(id:number):Observable<boolean>{
    this.http.delete<boolean>('http://localhost:8083/infractions/'+id).subscribe(
      (data)=>{
        let radar=data;
      }
    )
    return of(true)
  }
  public searchInfraction(keyword:string):Observable<Infraction[]>{
    let result=this.infractions.filter(i=>i.id.toString().includes(keyword))
    return of(result)
  }
}
