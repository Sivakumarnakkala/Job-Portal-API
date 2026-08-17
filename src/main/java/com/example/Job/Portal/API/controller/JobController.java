package com.example.Job.Portal.API.controller;

import com.example.Job.Portal.API.model.Job;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final List<Job> jobs = new ArrayList<>();

    public JobController() {

        jobs.add(new Job(
                1,
                "Java Developer",
                "ABC Technologies",
                "Hyderabad",
                "0-2 years"
        ));

        jobs.add(new Job(
                2,
                "DevOps Engineer",
                "XYZ Solutions",
                "Bangalore",
                "1-3 years"
        ));
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobs;
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {

        return jobs.stream()
                .filter(job -> job.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        jobs.add(job);
        return job;
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable int id) {

        boolean removed = jobs.removeIf(job -> job.getId() == id);

        if (removed) {
            return "Job deleted successfully";
        }

        return "Job not found";
    }
}
