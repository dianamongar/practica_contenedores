package com.examplecontenedores.exercise1.bl;


import java.util.*;

import org.springframework.stereotype.Repository;

import com.examplecontenedores.exercise1.dto.Task;

@Repository
public class TaskBl {
    List<Task> database=new ArrayList<>();
    private int nextTaskId = 3;
    
    public int getNextTaskId() {
        nextTaskId++;
        return nextTaskId;
    }
    public TaskBl(){
        init();
    }
    public void init() {	
        // Inicializa algunas tareas y guárdalas en TaskRepository
        Task task1 = new Task(1, "hacer tarea 1", "25/10/2023", "Pendiente");
		Task task2 = new Task(2, "hacer tarea 2", "25/11/2023", "Pendiente");
		Task task3 = new Task(3, "hacer tarea 3", "25/12/2023", "Pendiente");
        create(task1);
		create(task2);
		create(task3);
    }
    
    public Task create(Task task){
        Task newTask=task;
        newTask.setTaskId(getNextTaskId());
        database.add(task);
        return newTask;
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
