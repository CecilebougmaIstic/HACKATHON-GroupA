import { TestBed } from '@angular/core/testing';

import { TransmusicaleService } from './transmusicale-service';

describe('TransmusicaleService', () => {
  let service: TransmusicaleService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TransmusicaleService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
