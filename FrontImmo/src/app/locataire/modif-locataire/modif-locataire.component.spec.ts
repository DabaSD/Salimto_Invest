import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifLocataireComponent } from './modif-locataire.component';

describe('ModifLocataireComponent', () => {
  let component: ModifLocataireComponent;
  let fixture: ComponentFixture<ModifLocataireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifLocataireComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModifLocataireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
