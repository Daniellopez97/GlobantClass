
package Entities;


public class Cinema {
    
    private String movie;
    private double priceTicket;
    private String theater[][] = new String [8][6];

    public Cinema(String movie, double priceTicket) {
        this.movie = movie;
        this.priceTicket = priceTicket;
    }

    public Cinema() {
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public String[][] getTheater() {
        return theater;
    }

    public void setTheater(String[][] theater) {
        this.theater = theater;
    }

    @Override
    public String toString() {
        return "Cinema{" + "movie=" + movie + ", priceTicket=" + priceTicket + ", theater=" + theater + '}';
    }
    
    
}
