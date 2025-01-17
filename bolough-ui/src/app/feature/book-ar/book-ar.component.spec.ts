import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookArComponent } from './book-ar.component';

describe('BookArComponent', () => {
  let component: BookArComponent;
  let fixture: ComponentFixture<BookArComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BookArComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BookArComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
