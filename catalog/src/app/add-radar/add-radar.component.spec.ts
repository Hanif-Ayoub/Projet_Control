import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRadarComponent } from './add-radar.component';

describe('AddRadarComponent', () => {
  let component: AddRadarComponent;
  let fixture: ComponentFixture<AddRadarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRadarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddRadarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
