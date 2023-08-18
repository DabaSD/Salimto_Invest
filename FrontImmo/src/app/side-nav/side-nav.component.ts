import { Component, OnInit } from '@angular/core';
import {
  faHome,
  faBuilding,
  faUsers,
  faDollarSign,
  faMoneyBillWave,
  faFileContract,
  faUserCircle,
  faAngleLeft,
} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  faHome = faHome;
  faBuilding = faBuilding;
  faUsers = faUsers;
  faDollarSign = faDollarSign;
  faMoneyBillWave = faMoneyBillWave;
  faFileContract = faFileContract;
  faUserCircle = faUserCircle;
  faAngleLeft = faAngleLeft;
  constructor() { }

  ngOnInit(): void {
  }

}