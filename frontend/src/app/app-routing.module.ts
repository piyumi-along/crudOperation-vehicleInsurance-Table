import { VehicleOwnerComponent } from './vehicle-owner/vehicle-owner.component';
import { VehicleComponent } from './vehicle/vehicle.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClaimsComponent } from './claims/claims.component';


const routes: Routes = [
  { path: 'vehicle', component: VehicleComponent},
  {path: 'vehicleOwners',component: VehicleOwnerComponent},
  {path: 'claims',component:ClaimsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
