import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArContentComponent } from './ar-content.component';

describe('ArContentComponent', () => {
  let component: ArContentComponent;
  let fixture: ComponentFixture<ArContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ArContentComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ArContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
