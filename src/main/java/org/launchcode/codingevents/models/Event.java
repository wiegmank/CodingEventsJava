package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

//    @NotBlank(message = "Please enter a location.")
//    private String location;
//
//    @AssertTrue(message = "This must be yes/true")
//    private boolean isRegRequired;
//
//    @NotBlank(message = "Number of attendees is required.")
//    @Positive( message = "There must be at least 1 attendee")
//    private int numAttendees;
//
//    @PositiveOrZero(message = "Entry fee cannot be negative, but may be $0.")
//    private int entryFee;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        //String location,
    // boolean isRegRequired, int numAttendees, int entryFee, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
//        this.location = location;
//        this.isRegRequired = isRegRequired;
//        this.numAttendees = numAttendees;
//        this.entryFee = entryFee;
        this.type = type;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public boolean isRegRequired() {
//        return isRegRequired;
//    }
//
//    public void setRegRequired(boolean regRequired) {
//        this.isRegRequired = regRequired;
//    }
//
//    public int getNumAttendees() {
//        return numAttendees;
//    }
//
//    public void setNumAttendees(int numAttendees) {
//        this.numAttendees = numAttendees;
//    }
//
//    public int getEntryFee() {
//        return entryFee;
//    }
//
//    public void setEntryFee(int entryFee) {
//        this.entryFee = entryFee;
//    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
