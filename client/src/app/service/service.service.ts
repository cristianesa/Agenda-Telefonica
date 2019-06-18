import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contato } from '../modelo/contato';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  contato: Contato;
  constructor(private http: HttpClient) { }
  Url = 'http://localhost:8080/agenda/contatos';

  getContatos() {
    return this.http.get<Contato[]>(this.Url);

  }
}


