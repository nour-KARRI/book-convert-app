import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SharedRoutingModule } from './shared-routing.module';
import { FrContentComponent } from './content/fr-content/fr-content.component';
import { EnContentComponent } from './content/en-content/en-content.component';
import { ArContentComponent } from './content/ar-content/ar-content.component';


@NgModule({
  declarations: [
    FrContentComponent,
    EnContentComponent,
    ArContentComponent
  ],
  imports: [
    CommonModule,
    SharedRoutingModule
  ],
  exports:[
    FrContentComponent,
    EnContentComponent,
    ArContentComponent
  ]
})
export class SharedModule { }
