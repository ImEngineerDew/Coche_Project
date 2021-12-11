import { Component, OnInit } from '@angular/core';

//Imported model
import { CarConcesionary } from 'src/app/models/teams.models';
import { CarsService } from 'src/app/services/teams.service';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class CarsComponent implements OnInit {

  //That's the array than contains the info
  cars:CarConcesionary [] =[];
  //Inject the service created 

  //This is an example for sending data to backend
  carsData={
    "id": "000",
    "name" : "Bogotá",
    "modelCar": "Camaro",
    "ageModel": 2008
  }
  //Inject the http client
  constructor(private serviceCars: CarsService) { }

  ngOnInit(): void {
    this.getCars();
    //this.saveCars(this.carsData);
  }

  //Create the method that could get the teams
  getCars()
  {
    this.serviceCars.getCars().subscribe((data: any)=>{ 
      this.cars = data
      console.log(data)
      })
  }

  //This method is able to send data to the backend
  saveCars(dato:CarConcesionary)
  {
     /*console.log("Information from child component: "+dato)*/    
    this.serviceCars.sendCars(dato).subscribe((data: any)=>{
      console.log(data);
      this.getCars();
    })
  }

}
