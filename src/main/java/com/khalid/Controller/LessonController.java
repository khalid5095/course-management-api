package com.khalid.Controller;

import com.khalid.Entity.Course;
import com.khalid.Entity.Lesson;
import com.khalid.Service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonController {
        @Autowired
        LessonService lessonService;
        @GetMapping("/topics/{topicId}/courses/{cid}/lessons")
        public List<Lesson> getAllLessons(@PathVariable String cid) {
            return lessonService.getAllLesson(cid);
        }
        @GetMapping("/topics/{topicId}/courses/{cid}/lessons/{id}")
        public Lesson getLesson(@PathVariable String id) {
            return lessonService.getLesson(id);
        }
        @PostMapping("/topics/{topicId}/courses/{cid}/lessons")
        public void addLesson(@RequestBody Lesson lesson, @PathVariable String cid) {
            lesson.setCourse(new Course(cid, "", "",""));
            lessonService.addLesson(lesson);
        }

        @PutMapping("/topics/{topicId}/courses/{cid}/lessons/{id}")
        public void updateLesson(@RequestBody Lesson lesson, @PathVariable String cid, @PathVariable String id) {
            lesson.setCourse(new Course(cid, "", "",""));
            lessonService.updateLesson(lesson);
        }
        @DeleteMapping("/topics/{topicId}/courses/{cid}/lessons/{id}")
        public void deleteLesson(@PathVariable String id) {
            lessonService.deleteLesson(id);
        }
    }

