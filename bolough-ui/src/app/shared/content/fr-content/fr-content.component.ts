import { Component, Input } from '@angular/core';
import { HadithTranslationRequestPayload } from '../../../shared/add-content/content.request.payload';
import { Router } from '@angular/router';

@Component({
  selector: 'app-fr-content',
  templateUrl: './fr-content.component.html',
  styleUrl: './fr-content.component.css'
})
export class FrContentComponent {

  @Input() hadith: HadithTranslationRequestPayload;

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
