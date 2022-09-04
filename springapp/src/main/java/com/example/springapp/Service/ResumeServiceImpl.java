package com.example.springapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Model.Resume;
import com.example.springapp.Repository.ResumeRepository;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public Resume getDetails() {

        return resumeRepository.findAll().get(0);
    }

    @Override
    public Resume postDetails(Resume resume) {
        return resumeRepository.save(resume);
    }

}