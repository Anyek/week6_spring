import { Component, OnInit } from "@angular/core";
import { Coffee } from "../coffee";
import { CoffeeService } from "../coffee.service";

@Component({
  selector: "app-list",
  templateUrl: "./list.component.html",
  styleUrls: ["./list.component.css"]
})
export class ListComponent implements OnInit {
  coffeeList: Coffee[] = [];

  getCoffee(): void {
    this.coffeeService.getCoffee().subscribe(data => (this.coffeeList = data));
  }
  deleteCoffee(id: number) {
    this.coffeeService.removeCoffee(id);
  }

  constructor(private coffeeService: CoffeeService) {}

  ngOnInit() {
    this.getCoffee();
  }
}
