import { Injectable } from '@angular/core';
import {Observable, of, throwError} from "rxjs";
import {ValidationErrors} from "@angular/forms";
import { Radar} from "../model/radar.model";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RadarService {

  private radars!:Array<Radar>;
  private radar!: Radar;

  constructor(private http: HttpClient) {
    this.getAllRadars()
  }

  public getAllRadars() : Observable<Radar[]>{
    this.http.get<Array<Radar>>('http://localhost:8082/radars').subscribe(
      (data)=>{
        this.radars=data;
        console.log("from s ",data)
      }
    )
    return of(this.radars);
  }

  public deleteRadar(id:number):Observable<boolean>{
    this.http.delete<boolean>('http://localhost:8082/radars/'+id).subscribe(
      (data)=>{
        let radar=data;
      }
    )
    return of(true)
  }


  public searchRadars(keyword:string):Observable<Radar[]>{
    let result=this.radars.filter(r=>r.id.toString().includes(keyword))
    return of(result)
  }

  public addNewRadar(radar:Radar):Observable<Radar>{
    this.http.post<Radar>('http://localhost:8082/radars',radar).subscribe(
      (data)=>{
        this.radar = data
      }
    )
    return of(this.radar)
  }
  public getRadar(id:number):Observable<Radar>{
    this.http.get<Radar>('http://localhost:8082/radars/'+id).subscribe(
      (data)=>{
        this.radar=data;
      }
    )
    return of(this.radar)
  }
  getErrorMessage(fieldName: string, error: ValidationErrors) {
    if(error["required"]){
      return fieldName+" is required"
    }else if(error["minlength"]) {
      return fieldName + " should have at least " + error["minlength"]["requiredLength"] + " charcters"
    }else if(error["min"]){
      return fieldName+" should be more than "+error["min"]["min"]
    }else return ""
  }
  public updateRadar(radar:Radar):Observable<Radar>{
    this.http.post<Radar>('http://localhost:8082/radars',radar).subscribe(
      (data)=>{
        this.radar = data
      }
    )
    return of(this.radar)
  }
}
