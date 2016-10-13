package com.yh.ticketOrder.processor;

import com.yh.ticketOrder.model.TicketOrder;
import com.yh.ticketOrder.service.BoxOfficeService;


public class TicketAllocator  implements Runnable  {

	private TicketOrder order;
	private BoxOfficeService boxOfficeService;
	
	public TicketAllocator(TicketOrder ord) {
		setBoxOfficeService(new BoxOfficeService());
		setOrder(ord);
	}
	
	public void run() {
		try {
			if(getBoxOfficeService().isBoxOfficeOpen()) {
				allocateTicket();
			}else{
				System.out.println("Box Office Closed");
			}
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    }
	}

	private void allocateTicket() {
		if(getBoxOfficeService().isMoviePlaying(getOrder().getMovieName())){
			if(getBoxOfficeService().isTicketAvailable(getOrder().getMovieName(), getOrder().getTicketRequired())){
				getBoxOfficeService().decrementTicket( getOrder().getMovieName(), getOrder().getTicketRequired());
				System.out.println("Ticket issued");
			}else{
				System.out.println("Ticket Not Available. Sold Out. House Full");
			}
		}else{
			System.out.println("Movie not playing at the box Office");
		}
	}

	public TicketOrder getOrder() {
		return order;
	}

	public void setOrder(TicketOrder order) {
		this.order = order;
	}

	public BoxOfficeService getBoxOfficeService() {
		return boxOfficeService;
	}

	public void setBoxOfficeService(BoxOfficeService boxOfficeService) {
		this.boxOfficeService = boxOfficeService;
	}

}
