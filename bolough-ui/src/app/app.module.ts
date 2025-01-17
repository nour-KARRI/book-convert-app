import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './core/header/header.component';
import { FooterComponent } from './core/footer/footer.component';
import { BookArComponent } from './feature/book-ar/book-ar.component';
import { BookFrComponent } from './feature/book-fr/book-fr.component';
import { BookEnComponent } from './feature/book-en/book-en.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { AddContentComponent } from './shared/add-content/add-content.component';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { HomeComponent } from './feature/home/home.component';
import { LanguageInterceptor } from './shared/interceptors/language.interceptor';
import { SharedModule } from './shared/shared.module';
import { CoreModule } from './core/core.module';


export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http);
}

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    BookArComponent,
    BookFrComponent,
    BookEnComponent,
    AddContentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
          useFactory: HttpLoaderFactory,
          deps: [HttpClient]
      }
    }),
    SharedModule,
    CoreModule
  ],
  providers: [{provide: HTTP_INTERCEPTORS, useClass: LanguageInterceptor, multi: true}, provideAnimationsAsync()],
  bootstrap: [AppComponent]
})
export class AppModule { }
