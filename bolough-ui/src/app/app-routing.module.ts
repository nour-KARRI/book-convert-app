import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookArComponent } from './feature/book-ar/book-ar.component';
import { BookFrComponent } from './feature/book-fr/book-fr.component';
import { BookEnComponent } from './feature/book-en/book-en.component';
import { AddContentComponent } from './shared/add-content/add-content.component';
import { HomeComponent } from './feature/home/home.component';
import { ArContentComponent } from './shared/content/ar-content/ar-content.component';

const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "ar", component: BookArComponent},
  {path: "fr", component: BookFrComponent},
  {path: "en", component: BookEnComponent},
  {path: "content", component: ArContentComponent},
  {path: "add-content", component: AddContentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
