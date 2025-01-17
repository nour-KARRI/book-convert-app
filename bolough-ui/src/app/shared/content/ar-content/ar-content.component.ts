import { Component, Input } from '@angular/core';
import { HadithRequestPayload } from '../../../shared/add-content/content.request.payload';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ar-content',
  templateUrl: './ar-content.component.html',
  styleUrl: './ar-content.component.css'
})
export class ArContentComponent {
  @Input() hadith: HadithRequestPayload;

  constructor(private router: Router){}

  getEnglishHadithTranslation(id:number){
    localStorage.setItem("lang", 'en');
    this.router.navigate(['/en'], {queryParams:{id: id}})
  }
  getFrenchHadithTranslation(id:number){
    localStorage.setItem("lang", 'fr');
    this.router.navigate(['/fr'], {queryParams:{id: id}})
  }
}
