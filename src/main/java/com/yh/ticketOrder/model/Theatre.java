package com.yh.ticketOrder.model;

public class Theatre {

	private int theatreNumber;
	private int capacity;
	private int ticketSold;
	
	private Movie moviePlaying;
	
	public Theatre() {
		setCapacity(10);
		setTicketSold(0);
	}
	
	public Theatre(Movie movie){
		setCapacity(10);
		setTicketSold(0);
		setMoviePlaying(movie);
	}
	
	public int getTheatreNumber() {
		return theatreNumber;
	}
	
	public void setTheatreNumber(int theatreNumber) {
		this.theatreNumber = theatreNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Movie getMoviePlaying() {
		return moviePlaying;
	}

	public void setMoviePlaying(Movie moviePlaying) {
		this.moviePlaying = moviePlaying;
	}

	public int getTicketSold() {
		return ticketSold;
	}

	public void setTicketSold(int ticketSold) {
		this.ticketSold = ticketSold;
	}
	
	public int availableTickets(){
		return getCapacity() - getTicketSold();
	}
}
