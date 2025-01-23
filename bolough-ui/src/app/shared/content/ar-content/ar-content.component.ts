import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { Hadith } from '../../../core/models/hadith.model';

@Component({
  selector: 'app-ar-content',
  templateUrl: './ar-content.component.html',
  styleUrl: './ar-content.component.css'
})
export class ArContentComponent {
  @Input() hadith!: Hadith;

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
