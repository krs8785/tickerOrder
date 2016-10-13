package com.yh.ticketOrder.service;

import com.yh.ticketOrder.model.BoxOffice;
import com.yh.ticketOrder.model.Theatre;

public class BoxOfficeService {

	public static void addMoviesToBoxOffice(String movieName, Theatre th){
		BoxOffice.getInstance().addToListOfTheatre(movieName, th);
	}
	
	public boolean isMoviePlaying(String movieName){
		if(BoxOffice.getInstance().getListOfTheatre().containsKey(movieName)){
			return true;
		}
		return false;
	}
	
	public boolean isTicketAvailable(String movieName, int quantity ){
		if(isMoviePlaying(movieName)){
			int availableTicket = BoxOffice.getInstance().getListOfTheatre().get(movieName).availableTickets();
			if(availableTicket >= quantity){
				return true;
			}
		}
		return false;
	}
	
	public boolean isBoxOfficeOpen(){
		if(BoxOffice.getInstance().getListOfTheatre().size() == 0){
			return false;
		}
		return true;
	}
	
	public void decrementTicket(String movieName, int quantity){
		BoxOffice.getInstance().decrementTicket(movieName, quantity);
	}
}
