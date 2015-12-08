package org.infobip.campus.sens.model;

public class Event {
    private int eventId;
    private String eventName;
    private Company eventOrganizer;

    public Event(String eventName, Company eventOrganizer) {
        this.eventName = eventName;
        this.eventOrganizer = eventOrganizer;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Company getEventOrganizer() {
        return eventOrganizer;
    }

    @Override
    public String toString() {
        return eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (eventId != event.eventId) return false;
        if (!eventName.equals(event.eventName)) return false;
        return eventOrganizer.equals(event.eventOrganizer);

    }

    @Override
    public int hashCode() {
        int result = eventId;
        result = 31 * result + eventName.hashCode();
        result = 31 * result + eventOrganizer.hashCode();
        return result;
    }
}