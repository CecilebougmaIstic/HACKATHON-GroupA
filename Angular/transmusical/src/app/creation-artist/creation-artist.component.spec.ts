import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreationArtistComponent } from './creation-artist.component';

describe('CreationArtistComponent', () => {
  let component: CreationArtistComponent;
  let fixture: ComponentFixture<CreationArtistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreationArtistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreationArtistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
