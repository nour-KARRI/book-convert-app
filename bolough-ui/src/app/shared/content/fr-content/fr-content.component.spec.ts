import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrContentComponent } from './fr-content.component';

describe('FrContentComponent', () => {
  let component: FrContentComponent;
  let fixture: ComponentFixture<FrContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FrContentComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FrContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
