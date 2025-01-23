import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { HadithTranslation } from '../../../core/models/hadithtranslation.model';

@Component({
  selector: 'app-fr-content',
  templateUrl: './fr-content.component.html',
  styleUrl: './fr-content.component.css'
})
export class FrContentComponent {

  @Input() hadith!: HadithTranslation;

  constructor(private router: Router){
  }

  getArabicHadithTranslation(id:number){
    this.router.navigate(['/ar'], {queryParams:{id: id}})
  }
  getEnglishHadithTranslation(id:number){
    localStorage.setItem("lang", 'en');
    this.router.navigate(['/en'], {queryParams:{id: id}})
  }

}
