import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookEnComponent } from './book-en.component';

describe('BookEnComponent', () => {
  let component: BookEnComponent;
  let fixture: ComponentFixture<BookEnComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BookEnComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BookEnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
