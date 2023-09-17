package com.examplecontenedores.exercise1.dto;

public class Task {
    private final int taskId;
    private final String name;
    private final String date;
    private final String status;
    public Task(int taskId, String name, String date, String status){
        this.taskId=taskId;
        this.name=name;
        this.date=date;
        this.status=status;
    }
    public int getTaskId() {
        return taskId;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getStatus() {
        return status;
    }
}
