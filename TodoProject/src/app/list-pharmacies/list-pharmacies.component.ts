import { Component, OnInit } from '@angular/core';
import { PharmacieDataService } from '../service/data/pharmacie-data.service';
import { Router } from '@angular/router';

export class PharmacieInService{
  constructor(public id : number, public dateFrom : Date, public dateTo : Date, public lieu : String, public pharmacieName : String, public adresse : String, public phone : number){}
}

@Component({
  selector: 'app-list-pharmacies',
  templateUrl: './list-pharmacies.component.html',
  styleUrls: ['./list-pharmacies.component.css']
})
export class ListPharmaciesComponent implements OnInit {

pharmacies : PharmacieInService[];

  constructor(private pharmacieDataService: PharmacieDataService, private router : Router) { }

  ngOnInit() {
    this.refreshTodo();
  }

  getAll(){
    this.pharmacieDataService.getAllPharmacies().subscribe(
      response=> this.pharmacies = response
    )
  }
  updatePharm(id){
  this.router.navigate(['pharm',id])
  }

  addPharm(){
    this.router.navigate(['pharm',-1])
    }

    deletePhar(id){
      this.pharmacieDataService.deletePharmacie(id).subscribe(
      response=>{
      this.refreshTodo();
      }
      )
    }
  
    refreshTodo(){
      this.pharmacieDataService.getAllPharmacies().subscribe(
        response=>this.pharmacies=response
      )
    }

}
