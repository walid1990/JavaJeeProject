import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  constructor() { }

  Authentification(username, password){
    if(username=="walid" && password=="aydi"){
      return true;
    }
    return false;
  }
}
