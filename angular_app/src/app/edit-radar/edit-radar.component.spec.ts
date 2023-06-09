import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditRadarComponent } from './edit-radar.component';

describe('EditRadarComponent', () => {
  let component: EditRadarComponent;
  let fixture: ComponentFixture<EditRadarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditRadarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditRadarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
