import { Component, OnInit } from '@angular/core';
import { PharmacieInService } from '../list-pharmacies/list-pharmacies.component';
import { PharmacieDataService } from '../service/data/pharmacie-data.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pharmacie',
  templateUrl: './pharmacie.component.html',
  styleUrls: ['./pharmacie.component.css']
})
export class PharmacieComponent implements OnInit {
  id;
  pharmacie : PharmacieInService;

  constructor(private pharmacieDataService : PharmacieDataService, private router : Router, private route:ActivatedRoute) { }

  ngOnInit() {
    this.id=this.route.snapshot.params['id'];
    this.pharmacie=new PharmacieInService(4, new Date(),new Date(), "", "","",70000000);
    if(this.id!=-1){
      this.pharmacieDataService.getById(this.id).subscribe(
        response=> this.pharmacie=response
      );
  }
}

  updateList(){
    if (this.id==-1){
      this.pharmacieDataService.updatePharmacie(this.pharmacie).subscribe(
        response=>this.router.navigate(['listPharm'])
      )
    }else{
      this.pharmacieDataService.addPharmacie(this.pharmacie).subscribe(
        response=>this.router.navigate(['listPharm'])
      )
    }
}

}
