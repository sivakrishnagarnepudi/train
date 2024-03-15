// Train.java
public abstract class Train {

    protected abstract void ticket() throws TicketingException;

    public abstract void seats() throws SeatingException;

    public void getPassengerTicket() {
        try {
            ticket();
            seats();
        } catch (TicketingException | SeatingException e) {
            System.out.println("An error occurred during ticketing: " + e.getMessage());
        }
    }

    public static String companyName = "Railways";

    public static void announceCompany() {
        System.out.println("Welcome to " + companyName);
    }
}
