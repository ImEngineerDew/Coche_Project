import { Component, Input, OnInit } from '@angular/core';
import { CarConcesionary } from 'src/app/models/teams.models';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  
  //That's the array than contains the info
  @Input("dato") cars:CarConcesionary[] =[];
  constructor() { }

  ngOnInit(): void {
  }

}
