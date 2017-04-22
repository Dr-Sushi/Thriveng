package com.thriveng.dao;

import com.thriveng.domain.Task;

import java.util.Date;
import java.util.List;

/**
 * Created by DoctorSushi on 4/15/17.
 */
public class EventDao {

    List<Task> taskList;
    String eventName;
    Date eventDate;

    public EventDao(String eventName, Date eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
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
