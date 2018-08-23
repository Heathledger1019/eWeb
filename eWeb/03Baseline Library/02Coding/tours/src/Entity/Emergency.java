package Entity;

import java.sql.Timestamp;

import AbstractClass.AbstractEmergency;

/**
 * Emergency entity. @author MyEclipse Persistence Tools
 */
public class Emergency extends AbstractEmergency implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Emergency() {
	}

	/** minimal constructor */
	public Emergency(Timestamp starttime, Timestamp endtime, String content, String title) {
		super(starttime, endtime, content, title);
	}

	/** full constructor */
	public Emergency(Administrator administrator, Timestamp starttime, Timestamp endtime, String content, String photo,
			String title) {
		super(administrator, starttime, endtime, content, photo, title);
	}

}
