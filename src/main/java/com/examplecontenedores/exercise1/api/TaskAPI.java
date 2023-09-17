package com.examplecontenedores.exercise1.api;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplecontenedores.exercise1.bl.TaskBl;
import com.examplecontenedores.exercise1.dto.Task;



@RestController
@RequestMapping("/api/v1/task")
public class TaskAPI {
    private TaskBl taskBl;
    public TaskAPI(){
        taskBl=new TaskBl();
    }
    @GetMapping("/holi")
    public Map create(Task task){
        taskBl.create(task);
        Map result=new HashMap();
        result.put("code","TASK-0000");
        result.put("result","Task created successfully");
        result.put("errorMessage",null);
        return result;
    }
    public List listAll(){
        return taskBl.listAll();
    }
    public void delete(int taskId){
        taskBl.delete(taskId);
    }
    public TaskBl getTaskBl() {
        return taskBl;
    }
    public void setTaskBl(TaskBl taskBl) {
        this.taskBl = taskBl;
    }
}
