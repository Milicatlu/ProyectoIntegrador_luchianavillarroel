import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RedessComponent } from './redess.component';

describe('RedessComponent', () => {
  let component: RedessComponent;
  let fixture: ComponentFixture<RedessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RedessComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RedessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
