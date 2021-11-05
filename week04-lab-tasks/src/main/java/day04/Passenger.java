package day04;

public class Passenger {
    private String name;
    private String ticketId;
    private int numberOfPackages;

    public Passenger(String name, String ticketId, int numberOfPackages) {
        this.name = name;
        this.ticketId = ticketId;
        this.numberOfPackages = numberOfPackages;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }
}
