import { TestBed } from '@angular/core/testing';

import { PharmacieDataService } from './pharmacie-data.service';

describe('PharmacieDataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PharmacieDataService = TestBed.get(PharmacieDataService);
    expect(service).toBeTruthy();
  });
});
