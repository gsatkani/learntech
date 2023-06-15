import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { SolutionsComponent } from './solutions/solutions.component';
import { ConsultingComponent } from './consulting/consulting.component';
import { SupportComponent } from './support/support.component';

// define the basic routes
const routes: Routes = [
{path:"products",component: ProductsComponent},
{path:"solutions",component:SolutionsComponent},
{path:"consulting",component:ConsultingComponent},
{path:"support",component:SupportComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
