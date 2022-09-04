package com.example.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Model.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {

}