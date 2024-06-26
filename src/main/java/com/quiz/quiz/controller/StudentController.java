package com.quiz.quiz.controller;

import com.quiz.quiz.Model.Quiz;
import com.quiz.quiz.Model.Student;
import com.quiz.quiz.service.QuizService;
import com.quiz.quiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<Student>createStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.creatStudebt(student));
    }
    @PutMapping("/update")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.UpdateStudebt(student));
    }
    @DeleteMapping("/delete")
    public void delete(){
        studentService.deleteAll();
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>>getAll(){
        return ResponseEntity.ok(studentService.getAll());
    }
    @GetMapping("/DoQuiz/{id}")
    public ResponseEntity<Quiz>DoQuiz(@RequestParam Long quizId){
        return ResponseEntity.ok(studentService.DoQuiz(quizId));
    }

}
