package Entity;

import java.sql.Timestamp;

import AbstractClass.AbstractComplaint;

/**
 * Complaint entity. @author MyEclipse Persistence Tools
 */
public class Complaint extends AbstractComplaint implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Complaint() {
	}

	/** minimal constructor */
	public Complaint(Timestamp time, String content, Boolean ishandle) {
		super(time, content, ishandle);
	}

	/** full constructor */
	public Complaint(Tourist tourist, Timestamp time, String content, String photo2, Boolean ishandle,
			Timestamp dealtime, String answer, String evaluate) {
		super(tourist, time, content, photo2, ishandle, dealtime, answer, evaluate);
	}

}
