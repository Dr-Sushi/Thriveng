package com.thriveng.poc;

import com.thriveng.domain.Event;
import com.thriveng.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Allen on 4/28/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    EventRepository eventRepository;

    @Override
    public void run(String... args) throws Exception {
        Event event = new Event("Jenny and Allen's Wedding", new Date("11/02/2012"));

        eventRepository.save(event);
    }
}
