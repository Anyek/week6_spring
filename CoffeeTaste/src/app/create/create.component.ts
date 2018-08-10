import { Component, OnInit } from "@angular/core";
import { CoffeeService } from "../coffee.service";
import { Coffee } from "../coffee";

@Component({
  selector: "app-create",
  templateUrl: "./create.component.html",
  styleUrls: ["./create.component.css"]
})
export class CreateComponent implements OnInit {
  coffee: Coffee = new Coffee();

  addCoffee() {
    this.coffeeService.addCoffee(this.coffee);
    this.coffee = new Coffee();
  }
  constructor(private coffeeService: CoffeeService) {}

  ngOnInit() {}
}
