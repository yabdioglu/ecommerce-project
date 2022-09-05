import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductService } from './services/product.service';

import { Routes, RouterModule } from '@angular/router';
import { ProductCategoryMenuComponent } from './components/product-category-menu/product-category-menu.component';
import { SearchComponent } from './components/search/search.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';

const routes: Routes = [
  /*
  Order of routes is important
  First match winds.
  Start from most specific to generic
  */
  { path: 'products/:id', component: ProductDetailsComponent},
  { path: 'search/:keyword', component: ProductListComponent},
  { path: 'category/:id', component: ProductListComponent }, // when path matches, create new instance of component
  { path: 'category', component: ProductListComponent },
  { path: 'products', component: ProductListComponent },
  { path: '', redirectTo: '/products', pathMatch: 'full' },
  { path: '""', redirectTo: '/products', pathMatch: 'full' }, // This is the generic wildcard.
  // It will match on anything that didn't match above routes.

];

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCategoryMenuComponent,
    SearchComponent,
    ProductDetailsComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule
  ],
  providers: [ProductService],
  /*
  "providers": this will allow us to inject 
  that given service into other parts of our application.
  */
  bootstrap: [AppComponent]
})
export class AppModule { }
