import { Component, OnInit } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
import { ContentService } from '../../shared/services/content.service';
import { HadithTranslationRequestPayload } from '../../shared/add-content/content.request.payload';
import { throwError } from 'rxjs';


interface Locale {
  code: string;
  label: string;
}

@Component({
  selector: 'app-book-en',
  templateUrl: './book-en.component.html',
  styleUrl: './book-en.component.css'
})
export class BookEnComponent implements OnInit{

  hadith: HadithTranslationRequestPayload;
  
  constructor(private translate: TranslateService, 
    private contentService: ContentService){
    this.gethadith(1);
}
  ngOnInit(): void {
    this.defaultLang();
  }

  changeLang(event:any){
    this.translate.setDefaultLang(event.target.id || 'en');
    localStorage.setItem("lang", event.target.id);
  }

  defaultLang(){
    this.translate.setDefaultLang('en');
    localStorage.setItem("lang", 'en');
   }

  gethadith(id: number){
    this.contentService.getHadithTranslation(id).subscribe(data=>{
      this.hadith=data
    }, error=>{
      throwError(error)
    }
  );
  }
}
