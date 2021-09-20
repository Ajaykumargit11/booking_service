package com.htc.booking_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController("/api")
public class BookingController {

	private static final Logger LOG = Logger.getLogger(BookingController.class.getName());
	 
 