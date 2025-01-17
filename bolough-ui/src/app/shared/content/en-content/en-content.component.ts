import { Component, Input } from '@angular/core';
import { HadithTranslationRequestPayload } from '../../../shared/add-content/content.request.payload';
import { TranslateService } from '@ngx-translate/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-en-content',
  templateUrl: './en-content.component.html',
  styleUrl: './en-content.component.css'
})
export class EnContentComponent {
  @Input() hadith: HadithTranslationRequestPayload;

  constructor(private router: Router){
  }

  getArabicHadithTranslation(id:number){
    this.router.navigate(['/ar'], {queryParams:{id: id}})
  }
  getFrenchHadithTranslation(id:number){
    localStorage.setItem("lang", 'fr');
    this.router.navigate(['/fr'], {queryParams:{id: id}})
  }
}
