import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment }  from '../../environments/environment'
import { CarConcesionary } from '../models/teams.models';

@Injectable({
  providedIn: 'root'
})
export class CarsService {

  url:string = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getCars()
  {
    return this.http.get(`${this.url}/api/brands`);  
  }

  //Fron that function than will send the teams
  sendCars(dato:CarConcesionary)
  {
    return this.http.post(`${this.url}/api/brands`,dato)
  }
}
