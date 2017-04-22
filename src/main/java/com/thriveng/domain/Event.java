package com.thriveng.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Entity
public class Event {
    @Id
    @GeneratedValue
    Long id;
    @OneToMany(fetch = FetchType.LAZY)
    List<Task> taskList;
    String eventName;
    Date eventDate;

    public Event(String eventName, Date eventDate) {
        this.eventDate = eventDate;
        this.eventName = eventName;
    }

    public Long getId() {
        return id;
    }


    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }


}
