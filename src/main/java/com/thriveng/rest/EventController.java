package com.thriveng.rest;

import com.thriveng.dao.EventDao;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@RestController
@RequestMapping("thriveng-service")
public class EventController {

    @RequestMapping(path = "/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventDao> getEvents() {
        EventDao sampleEvent = new EventDao("Allen and Jenny's Wedding", new Date("11/02/2012"));
        List<EventDao> events = new ArrayList<>();
        events.add(sampleEvent);
        return events;
    }
}
