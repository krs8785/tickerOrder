package com.yh.ticketOrder.model;

import java.util.HashMap;

public class BoxOffice {

	private static BoxOffice boxOffice;
	private HashMap<String, Theatre> listOfTheatre;
	
	private BoxOffice() {
		setListOfTheatre(new HashMap<String, Theatre>());
	}
	
	public static BoxOffice getInstance(){
		if (boxOffice == null) {
			boxOffice = new BoxOffice();
		}
		return boxOffice;	
	}

	private void setListOfTheatre(HashMap<String, Theatre> hashMap) {
		this.listOfTheatre = hashMap;
	}

	public HashMap<String, Theatre> getListOfTheatre() {
		return listOfTheatre;
	}

	public synchronized void addToListOfTheatre(String movieName, Theatre th) {
		getListOfTheatre().put(movieName, th);
	}
	
	/**
	 * Assign ticket and increment number of ticket solds
	 * @param movieName
	 * @param quantity
	 */
	public synchronized void decrementTicket(String movieName, int quantity){
		getListOfTheatre().get(movieName).setTicketSold(getListOfTheatre().get(movieName).getTicketSold()+quantity);
	}
	
}
