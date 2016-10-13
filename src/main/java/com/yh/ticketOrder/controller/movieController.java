package com.yh.ticketOrder.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.yh.ticketOrder.model.Movie;
import com.yh.ticketOrder.model.Theatre;
import com.yh.ticketOrder.service.BoxOfficeService;

public class movieController {

	public static void addMoviesToBoxOffice(String file) {
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				BoxOfficeService.addMoviesToBoxOffice(line,new Theatre(new Movie(line)));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
