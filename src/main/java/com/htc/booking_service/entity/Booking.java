package com.htc.booking_service.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "booking")
public class Booking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3585887009133527572L;
	@Id
	@GeneratedValue
	private long bookingId;
	
	
	private LocalDateTime bookingDate;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(long bookingId, LocalDateTime bookingDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingDate, bookingId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingDate, other.bookingDate) && bookingId == other.bookingId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + "]";
	}
	

}
