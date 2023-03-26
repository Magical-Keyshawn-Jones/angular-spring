import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestingAngularComponent } from './testing-angular.component';

describe('TestingAngularComponent', () => {
  let component: TestingAngularComponent;
  let fixture: ComponentFixture<TestingAngularComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestingAngularComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TestingAngularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
