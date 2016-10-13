package com.yh.ticketOrder.model;

public class TicketOrder {

	private String movieName;
	private int ticketRequired;
	
	public TicketOrder(String name, int quant) {
		setMovieName(name);
		setTicketRequired(quant);
	}

	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public int getTicketRequired() {
		return ticketRequired;
	}
	
	public void setTicketRequired(int ticketRequired) {
		this.ticketRequired = ticketRequired;
	}
}
