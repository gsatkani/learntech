import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HighlightDirective } from './directive/highlight.directive';
import { ProductService } from './service/product.service';
import { UserComponent } from './user/user.component';
import { CustomerService } from './service/customer.service';
import { ProductsComponent } from './products/products.component';
import { SolutionsComponent } from './solutions/solutions.component';
import { ConsultingComponent } from './consulting/consulting.component';
import { SupportComponent } from './support/support.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HighlightDirective,
    UserComponent,
    ProductsComponent,
    SolutionsComponent,
    ConsultingComponent,
    SupportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [ProductService,CustomerService],
  bootstrap: [AppComponent],
})
export class AppModule { }
