import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyContactListComponent } from './my-contact-list.component';

describe('MyContactListComponent', () => {
  let component: MyContactListComponent;
  let fixture: ComponentFixture<MyContactListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MyContactListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyContactListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
