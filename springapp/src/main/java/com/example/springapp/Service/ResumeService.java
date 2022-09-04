package com.example.springapp.Service;

import com.example.springapp.Model.Resume;

public interface ResumeService {
    public Resume getDetails();

    public Resume postDetails(Resume resume);
}