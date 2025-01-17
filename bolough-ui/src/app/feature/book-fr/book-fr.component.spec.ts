import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookFrComponent } from './book-fr.component';

describe('BookFrComponent', () => {
  let component: BookFrComponent;
  let fixture: ComponentFixture<BookFrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BookFrComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BookFrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
