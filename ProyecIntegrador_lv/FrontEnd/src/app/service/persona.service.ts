import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona.module';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL= 'http://localhost:8080/personas/';

  constructor(private httpclient: HttpClient ) {}

  public lista(): Observable<Persona[]> {
    return this.httpclient.get<Persona[]>(this.URL + 'lista');
  }
  public detail(id: number): Observable<Persona> {
    return this.httpclient.get<Persona>(this.URL + `detail/${id}`);
  }
  
  public update(id: number, persona: Persona): Observable<any>{
    return this.httpclient.put<any>(this.URL +`update/${id}`, persona);
  }
  /*
  public save(educacion: Educacion): Observable<any>{
    return this.httclient.post<any>(this.URL +'create', educacion);
  }
  public delete(id: number): Observable<any> {
    return this.httclient.delete<any>(this.URL +  `delete/${id}`);
  }*/

}
