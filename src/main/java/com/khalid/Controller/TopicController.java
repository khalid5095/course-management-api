package com.khalid.Controller;

import com.khalid.Entity.Topic;
import com.khalid.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/topics")
    public List<Topic> findAll() {
        return topicService.getAllTopics();
    }
    @GetMapping("/topic/{id}")
    public Topic findById(@PathVariable String id) {
        return topicService.getTopic(id);
    }
    @PostMapping("/topic")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id,topic);
    }
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
