import {Vehicule} from "./vehicule.model";

export interface Owner{
  id:number;
  name:string;
  date_birth:string;
  email:string;
  vehicules:Array<Vehicule>
}

