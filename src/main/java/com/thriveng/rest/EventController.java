package com.thriveng.rest;

import com.thriveng.dao.EventDao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Controller
@RequestMapping("thriveng-service/events")
public class EventController {

    @RequestMapping(method = RequestMethod.GET)
    public List<EventDao> getEvents() {
        EventDao sampleEvent = new EventDao("Allen and Jenny's Wedding", new Date("11/02/2012"));
        List<EventDao> events = new ArrayList<>();
        events.add(sampleEvent);
        return events;
    }
}
