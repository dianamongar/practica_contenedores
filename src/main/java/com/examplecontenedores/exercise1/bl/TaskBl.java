package com.examplecontenedores.exercise1.bl;


import java.util.*;

import com.examplecontenedores.exercise1.dto.Task;


public class TaskBl {
    List<Task> database=new ArrayList();
    public void create(Task task){
        database.add(task);
    }
    public List<Task> listAll(){
        return database;
    }
    public void delete(int taskId){
        for(int i=0;i<database.size();i++){
            Task t=database.get(i);
            if(t.getTaskId()==taskId){
                database.remove(i);
            }
        }
    }
}
