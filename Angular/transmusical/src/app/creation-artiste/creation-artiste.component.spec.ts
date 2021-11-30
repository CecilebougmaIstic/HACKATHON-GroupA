import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreationArtisteComponent } from './creation-artiste.component';

describe('CreationArtisteComponent', () => {
  let component: CreationArtisteComponent;
  let fixture: ComponentFixture<CreationArtisteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreationArtisteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreationArtisteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
