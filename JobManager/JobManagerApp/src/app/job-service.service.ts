import { Injectable } from "@angular/core";
import { Job } from "./job";
import { Observable } from "../../node_modules/rxjs";
import { HttpClient } from "../../node_modules/@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class JobServiceService {
  url: string = "http://localhost:8080/job";

  jobList: Job[] = [];

  getJob(): Observable<Job[]> {
    return this.http.get<Job[]>(this.url);
  }
  addJob(job: Job) {
    this.http.post(this.url, job).subscribe();
  }
  removeJob(id: number) {
    this.http.delete(this.url + "/" + id).subscribe();
  }

  constructor(private http: HttpClient) {}
}
