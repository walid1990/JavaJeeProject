import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PharmacieInService } from 'src/app/list-pharmacies/list-pharmacies.component';



@Injectable({
  providedIn: 'root'
})
export class PharmacieDataService {

  constructor(private http : HttpClient) { }

  getAllPharmacies(){
    return this.http.get<PharmacieInService[]>('http://localhost:8080/pharmacies')
  }

  getById(id){
    return this.http.get<PharmacieInService>(`http://localhost:8080/pharmacies/id/${id}`)
  }

  addPharmacie(pharmacie){
    return this.http.post('http://localhost:8080/pharmacies', pharmacie);
  }

  updatePharmacie(pharmacie){
    return this.http.put('http://localhost:8080/pharmacies', pharmacie);
  }

  deletePharmacie(id){
    return this.http.delete(`http://localhost:8080/pharmacies/id/${id}`)
  }
}
