package com.khalid.Service;

import com.khalid.Entity.Course;
import com.khalid.Entity.Lesson;
import com.khalid.Repository.CourseRepo;
import com.khalid.Repository.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    private LessonRepo lessonRepo;
    public List<Lesson> getAllLesson(String cid) {
        return lessonRepo.findByCourseId(cid);    }

    public Lesson getLesson(String id) {
        return lessonRepo.findById(id).orElse(null);
    }

    public void addLesson(Lesson lesson) {
        lessonRepo.save(lesson);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepo.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepo.deleteById(id);
    }
}
