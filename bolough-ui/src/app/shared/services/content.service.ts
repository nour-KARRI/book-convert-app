import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ChapterRequestPayload } from '../add-content/content.request.payload';

@Injectable({
  providedIn: 'root'
})
export class ContentService {
    
  constructor(private http: HttpClient) { }

  createContent(contentPayload: ChapterRequestPayload): Observable<any> {
    return this.http.post("http://localhost:8080/api/hadith/", contentPayload);
  }

  getHadith(id: number): Observable<any> {
    return this.http.get("http://localhost:8080/api/hadith/"+id)
  }

  getHadithTranslation(id: number): Observable<any> {
    return this.http.get("http://localhost:8080/api/translation/"+id)
  }

}
