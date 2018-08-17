import { Component, OnInit } from "@angular/core";
import { JobServiceService } from "../job-service.service";
import { Job } from "../job";

@Component({
  selector: "app-create",
  templateUrl: "./create.component.html",
  styleUrls: ["./create.component.css"]
})
export class CreateComponent implements OnInit {
  job: Job = new Job();

  addJob() {
    this.jobServiceService.addJob(this.job);
    this.job = new Job();
  }

  constructor(private jobServiceService: JobServiceService) {}

  ngOnInit() {}
}
