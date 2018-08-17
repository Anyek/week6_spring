import { Component, OnInit } from "@angular/core";
import { Job } from "../job";
import { JobServiceService } from "../job-service.service";

@Component({
  selector: "app-list",
  templateUrl: "./list.component.html",
  styleUrls: ["./list.component.css"]
})
export class ListComponent implements OnInit {
  jobList: Job[] = [];

  getJob(): void {
    this.jobServiceService.getJob().subscribe(data => (this.jobList = data));
  }
  deleteJob(id: number) {
    this.jobServiceService.removeJob(id);
  }

  constructor(private jobServiceService: JobServiceService) {}

  ngOnInit() {
    this.getJob();
  }
}
