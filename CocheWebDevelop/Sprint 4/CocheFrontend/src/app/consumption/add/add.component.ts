import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CarConcesionary } from 'src/app/models/teams.models';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

 CarForm!: FormGroup;

  @Output() onNewCar: EventEmitter<CarConcesionary> = new EventEmitter();
  constructor(private foot : FormBuilder) { }

  ngOnInit(): void {
    this.CarForm=this.foot.group({
      id:[''],
      name:[''],
      modelCar:[''],
      ageModel:['']
    })
  }

  send()
  {
    console.log(this.CarForm.value)
    this.onNewCar.emit(this.CarForm.value)
  }

}
