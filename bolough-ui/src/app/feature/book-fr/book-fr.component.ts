import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';
import { ContentService } from '../../shared/services/content.service';
import { HadithTranslationRequestPayload } from '../../shared/add-content/content.request.payload';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-book-fr',
  templateUrl: './book-fr.component.html',
  styleUrl: './book-fr.component.css'
})
export class BookFrComponent implements OnInit{

  hadith: HadithTranslationRequestPayload;
  id=Number(this.route.snapshot.queryParamMap.get('id')) || 1;

  constructor(private translate: TranslateService, 
    private route: ActivatedRoute, private contentService: ContentService){
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
    this.translate.setDefaultLang('fr');
    localStorage.setItem("lang", 'fr');
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
