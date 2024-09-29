package com.example.subject_management.repository;

import com.example.subjectmanagement.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}