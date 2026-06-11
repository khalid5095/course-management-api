package com.khalid.Service;

import com.khalid.Entity.Course;
import com.khalid.Entity.Topic;
import com.khalid.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public void addCourse(Course course) {
         courseRepo.save(course);
    }

    public void   updateCourse(Course course) {
         courseRepo.save(course);
    }

    public void deleteCourse(String id) {
         courseRepo.deleteById(id);
    }

    public List<Course> getAllCourses(String topicId) {
        return courseRepo.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return courseRepo.findById(id).orElse(null);
    }
}
