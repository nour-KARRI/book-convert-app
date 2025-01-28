import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookArComponent } from '../feature/book-ar/book-ar.component';

const routes: Routes = [
  {path:"book-ar", component: BookArComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SharedRoutingModule { }
