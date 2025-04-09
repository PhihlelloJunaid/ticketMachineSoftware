package za.ac.cput.domain;

import java.time.LocalDate;

public class Ticket {
    public String ticketId;
    public int eventId;
    public int quantity;

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.eventId = builder.eventId;
        this.quantity = builder.quantity;

    }

    public String getTicketId() {
        return ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", eventId=" + eventId +
                ", quantity=" + quantity +
                '}';
    }

    public static class Builder {
        private String ticketId;
        private int eventId;
        private int quantity;

        public Builder setTicketId(String ticketId) {
            if (ticketId == null || ticketId.isEmpty()) {
                throw new IllegalArgumentException("Ticket Id cannot be null or empty");
            }
            this.ticketId = ticketId;
            return this;
        }

        public Builder setEventId(int eventId) {
            if (eventId <= 0) {
                throw new IllegalArgumentException("Event Id must be a positive integer");

            }
            this.eventId = eventId;
            return this;

        }

        public Builder setQuantity(int quantity) {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be a positive integer");

            }
            this.quantity = quantity;
            return this;
        }

        public Ticket build() {
            if (ticketId == null || eventId <= 0 || quantity <= 0) {
                throw new IllegalArgumentException("Ticket Id and Event Id cannot be null or empty");
            }
            return new Ticket(this);


        }
    }

}
