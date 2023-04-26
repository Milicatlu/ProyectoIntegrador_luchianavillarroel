import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/model/persona.module';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})
export class AcercadeComponent implements OnInit {
  
 persona:Persona = new Persona("","","");
constructor(public personaService: PersonaService){}

ngOnInit():void {
  this.personaService.getPersona().subscribe(data=>{console.log(data); this.persona=data})
}
}
