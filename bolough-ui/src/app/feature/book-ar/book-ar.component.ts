import { Component, OnInit } from '@angular/core';
import { throwError } from 'rxjs';
import { ContentService } from '../../shared/services/content.service';
import { TranslateService } from '@ngx-translate/core';
import { ActivatedRoute } from '@angular/router';
import { Hadith } from '../../core/models/hadith.model';

@Component({
  selector: 'app-book-ar',
  templateUrl: './book-ar.component.html',
  styleUrl: './book-ar.component.css'
})
export class BookArComponent implements OnInit{
  hadith!: Hadith;
  id=1;
  
  constructor(private contentService: ContentService, 
    private translate: TranslateService){}

  ngOnInit(): void {

      this.gethadith(this.id);
      this.defaultLang();
    }

  changeLang(event:any){
    this.translate.setDefaultLang(event.target.id || 'en');
    localStorage.setItem("lang", event.target.id);
  }

 defaultLang(){
  this.translate.setDefaultLang('ar');
  localStorage.setItem("lang", 'ar');
 }


 gethadith(id: number){
  this.contentService.getHadith(id).subscribe({
    next:(data)=>{
      this.hadith=data
    },
    error:(e)=>{
      throwError(e)
    }
 })
};
}
