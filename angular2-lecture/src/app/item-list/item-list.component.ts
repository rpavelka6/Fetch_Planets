import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {
  masteredSkills: string[];
  theSkills: string[];

  constructor() { 
    this.masteredSkills = [];
    this.theSkills = ["if-else", "for loop", "while loop"];
  }

  ngOnInit() {
  }

}
