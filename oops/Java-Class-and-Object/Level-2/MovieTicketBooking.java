public class MovieTicketBooking {
    static class MovieTicket {
        String movieName;
        String seatNumber;
        double price;

        MovieTicket(String movieName) {
            this.movieName = movieName;
        }

        void bookTicket(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked for " + movieName + " at seat " + seatNumber + " for price " + price);
        }

        void display() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers");
        ticket.bookTicket("A10", 300);
        ticket.display();
    }
}