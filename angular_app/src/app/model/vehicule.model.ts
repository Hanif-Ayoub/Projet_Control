import {Owner} from "./owner.model";

export interface Vehicule{
  id:number;
  matricule_number:number;
  marque:string;
  model:string;
  power:number;
  owner:Owner;
}

