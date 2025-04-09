package za.ac.cput.factory;
import za.ac.cput.domain.Ticket;

public class TicketFactory {
    public static Ticket createTicket(String ticketId, int eventId, int quantity) {
        return new Ticket.Builder()
                .setTicketId(ticketId)
                .setEventId(eventId)
                .setQuantity(quantity)
                .build();
    }
}
