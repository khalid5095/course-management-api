package com.khalid.Repository;

import com.khalid.Entity.Course;
import com.khalid.Entity.Lesson;
import com.khalid.Entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepo extends JpaRepository<Lesson, String> {

    List<Lesson> findByCourseId(String cid);
}
