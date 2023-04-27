import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from 'src/app/model/persona.module';
import { ImageService } from 'src/app/service/image.service';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-edit-acercade',
  templateUrl: './edit-acercade.component.html',
  styleUrls: ['./edit-acercade.component.css']
})
export class EditAcercadeComponent implements OnInit{
persona: Persona=null; 

constructor(private activatedRouter: ActivatedRoute, private router:Router,private personaS : PersonaService, public imageService: ImageService){}
ngOnInit():void {
  const id = this.activatedRouter.snapshot.params['id'];
  this.personaS.detail(id).subscribe(
    data => {
      this.persona = data;
      this.imageService.url = this.persona.img;
    }, err => {
      alert('Error al modificar ');
      this.router.navigate(['']);
    }
  )
}
onUpdate() {
  const id = this.activatedRouter.snapshot.params['id'];
  this.persona.img=this.imageService.url
  this.personaS.update(id, this.persona).subscribe(
    (data) => {
      this.router.navigate(['']);
    },
    (err) => {
      alert('Error al modificar perfil');
      this.router.navigate(['']);
    }
  )
}
uploadImage($event:any) {
  const id= this.activatedRouter.snapshot.params['id'];
  const name="perfil_" + id;
this.imageService.uploadImage($event, name);

}
}
