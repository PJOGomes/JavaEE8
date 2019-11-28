package org.PauloGomes.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto Generate Id
    private Long id; //Primary Key ->unique property for the row representing the object

    private String task;
    private LocalDate dueDate;
    private boolean isCompleted;
    private LocalDate dateCompleted;
    private LocalDate dateCreated;

    //Automate dateCreated Generation
    @PrePersist
    private void init() {
        setDateCreated(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
