import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutLocataireComponent } from './ajout-locataire.component';

describe('AjoutLocataireComponent', () => {
  let component: AjoutLocataireComponent;
  let fixture: ComponentFixture<AjoutLocataireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutLocataireComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AjoutLocataireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
