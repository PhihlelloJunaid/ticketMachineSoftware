package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

    public int eventID;
    public String eventName;
    public  String description;
    public LocalDate date;
    public LocalTime time;
    public String location;

    private Event (Builder builder){
        this.eventID = builder.eventID;
        this.eventName = builder.eventName;
        this.description = builder.description;
        this.date = builder.date;
        this.time = builder.time;
        this.location = builder.location;

    }
    public int getEventID() {
        return eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
    public static class Builder {
        private int eventID;
        private String eventName;
        private String description;
        private LocalDate date;
        private LocalTime time;
        private String location;

        public Builder setEventID(int eventID) {
            if (eventID <= 0) {
                throw new IllegalArgumentException("eventID must be a positive integer");
            }
            this.eventID = eventID;
            return this;
        }
        public Builder setEventName(String eventName) {
            if (eventName == null||eventName.isEmpty()) {
                throw new IllegalArgumentException("eventName cannot be null or empty");
            }
            this.eventName = eventName;
            return this;
        }
        public Builder setDescription(String description) {
            if (description == null||description.isEmpty()) {
                throw new IllegalArgumentException("description cannot be null or empty");

            }
            this.description = description;
            return this;
        }
        public Builder setDate(LocalDate date) {
            if (date == null) {
                throw new IllegalArgumentException("date cannot be null");

            }
            this.date = date;
            return this;
        }
        public Builder setTime(LocalTime time) {
            if (time == null) {
                throw new IllegalArgumentException("time cannot be null");
            }
            this.time = time;
            return this;

        }
        public Builder setLocation(String location) {
            if (location == null||location.isEmpty()) {
                throw new IllegalArgumentException("location cannot be null or empty");

            }
            this.location = location;
            return this;

        }
        public Event build() {
            if (eventID <= 0||eventName == null ||description == null||date == null||time == null||location == null) {
                throw new IllegalArgumentException("eventID and eventName cannot be null or empty");
            }
            return new Event(this);

        }

    }

}
