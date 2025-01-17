import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
 
@Injectable()
export class LanguageInterceptor implements HttpInterceptor {
 
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    request = request.clone({headers: request.headers.set('Content-Type', 'application/json')});
    request = request.clone({headers: request.headers.set('Accept-Language', 'fr-FR')});

    const langHead = localStorage.getItem('lang') || 'en';
    request = request.clone({
      setHeaders: {
        'Accept-Language': langHead
      }
    });
     return next.handle(request);
  }
 
}