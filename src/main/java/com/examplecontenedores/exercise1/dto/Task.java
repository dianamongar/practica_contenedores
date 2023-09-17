package com.examplecontenedores.exercise1.dto;

public class Task {
    private int taskId;
    private final String name;
    private final String date;
    private final String status;
    public Task(int taskId, String name, String date, String status){
        this.taskId=taskId;
        this.name=name;
        this.date=date;
        this.status=status;
    }
    public Task(String name, String date, String status){
        this.taskId=-1;
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
    public void setTaskId(int id) {
        taskId=id;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + taskId + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date + '\'' +
                ", status=" + status +
                '}';
    }
}
