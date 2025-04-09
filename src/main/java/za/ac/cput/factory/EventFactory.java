package za.ac.cput.factory;
import za.ac.cput.domain.Event;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventFactory {

    public static Event createEvent(int eventID, String eventName, String description, LocalDate date, LocalTime time,String location) {
        return new Event.Builder()
                .setEventID(eventID)
                .setEventName(eventName)
                .setDescription(description)
                .setTime(time)
                .setDate(date)
                .setLocation(location)
                .build();

    }
}
