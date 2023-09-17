package com.examplecontenedores.exercise1.api;
import java.util.*;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplecontenedores.exercise1.bl.TaskBl;
import com.examplecontenedores.exercise1.dto.Task;



@RestController
//@RequestMapping("/api/v1/task")
public class TaskAPI {
    private TaskBl taskBl;
    public TaskAPI(){
        taskBl=new TaskBl();
    }
    @PostMapping("/api/v1/task")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskBl.create(task);
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(createdTask);
    }
    /*public ResponseEntity<ProductID> createProduct(@RequestBody final Product product){
        ProductID result=new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(result) ;
    }*/

    public Map create(Task task){
        taskBl.create(task);
        Map result=new HashMap();
        result.put("code","TASK-0000");
        result.put("result","Task created successfully");
        result.put("errorMessage",null);
        return result;
    }

    @GetMapping("/api/v1/task")
    public List<Task> listAll(){
        return taskBl.listAll();    
    }

    @DeleteMapping("/api/v1/task/{taskId}")
    public void delete(@PathVariable final int taskId){
        taskBl.delete(taskId);
    }
    public TaskBl getTaskBl() {
        return taskBl;
    }
    public void setTaskBl(TaskBl taskBl) {
        this.taskBl = taskBl;
    }
}
