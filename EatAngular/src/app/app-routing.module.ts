import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeleteComponent } from './delete/delete.component';
import { AboutComponent } from './about/about.component';
import { InsertComponent } from './insert/insert.component';
import { UpdateComponent } from './update/update.component';
import { ViewComponent } from './view/view.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:`about` ,component:AboutComponent},
  {path:`insert` ,component:InsertComponent},
  {path:`update` ,component:UpdateComponent},
  {path:`delete` ,component:DeleteComponent},
  {path:`view` ,component:ViewComponent},
  {path:`login` ,component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
