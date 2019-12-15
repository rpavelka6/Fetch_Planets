import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-learning-objective',
  templateUrl: './learning-objective.component.html',
  styleUrls: ['./learning-objective.component.css']
})
export class LearningObjectiveComponent implements OnInit {

  topics: String[] = ["Creating a project", "Creating a component", "Viewing your project"];
  
  constructor() { }

  ngOnInit() {
  }

}
