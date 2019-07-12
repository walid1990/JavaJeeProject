import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PharmacieComponent } from './pharmacie/pharmacie.component';
import { ListPharmaciesComponent } from './list-pharmacies/list-pharmacies.component';


const routes: Routes = [
  {path : 'pharm/:id' , component: PharmacieComponent},
  {path : 'listPharm', component: ListPharmaciesComponent},
  {path: '', component: ListPharmaciesComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
