import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  food: any;

  constructor(private f4: FoodService) {
    this.viewfood();
  }
  // foo!:any;

  ngOnInit(): void {
  }
  viewfood() {
    this.f4.viewfood1().subscribe(
      (resp) => { this.food = resp; }
    );
  }

}
