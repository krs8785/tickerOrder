package com.yh.ticketOrder.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.yh.ticketOrder.model.TicketOrder;
import com.yh.ticketOrder.processor.TicketExecutor;

public class ticketController {

	public static void processTicketOrder(String file){
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				String[] order = line.split(" ");
				TicketExecutor.addOrderToQueue(new TicketOrder(order[0],Integer.parseInt(order[1])));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
