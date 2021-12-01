import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MessageToMobileComponent } from './message-to-mobile.component';

describe('MessageToMobileComponent', () => {
  let component: MessageToMobileComponent;
  let fixture: ComponentFixture<MessageToMobileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MessageToMobileComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MessageToMobileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
