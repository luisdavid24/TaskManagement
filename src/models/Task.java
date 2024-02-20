package models;

import java.util.Date;

public class Task {
    private String title;

    private String description;
    private Date dateExpiration;
    private boolean completed;

    public Task(String title, String description, Date dateExpiration, boolean completed) {
        this.title = title;
        this.description = description;
        this.dateExpiration = dateExpiration;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
