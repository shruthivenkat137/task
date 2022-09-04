package com.example.springapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Model.Resume;
import com.example.springapp.Service.ResumeService;

@RestController
@CrossOrigin("*")
public class ResumeController {
    @Autowired
    ResumeService resumeService;

    @GetMapping("/getDetails")
    public Resume getDetails() {
        return resumeService.getDetails();
    }

    @PostMapping("/postDetails")
    public Resume postDetails(@RequestBody Resume resume) {
        return resumeService.postDetails(resume);
    }
}
