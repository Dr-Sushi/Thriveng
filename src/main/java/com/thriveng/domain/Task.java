package com.thriveng.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Entity
public class Task {
    @Id
    @GeneratedValue
    Long id;
    String location;
    Date dueDate;
    String description;
    @OneToOne
    User assignedTo;
    Long eventId;

    public Task(String location, Date dueDate, String description, Long eventId) {
        this.location = location;
        this.dueDate = dueDate;
        this.description = description;
        this.eventId = eventId;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getId() {
        return id;
    }
}
