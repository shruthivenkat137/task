import { Component } from '@angular/core';
import studentsData from './students.json' 

interface Student {  
   
  name: String;  
  attendance: String;  

}  
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'task';   
  students: Student[] = studentsData;    
  }  

