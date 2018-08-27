package AbstractClass;

import java.sql.Timestamp;

import Entity.Administrator;

/**
 * AbstractEmergency entity provides the base persistence definition of the
 * Emergency entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmergency implements java.io.Serializable {

	// Fields

	private String id3;
	private Administrator administrator;
	private Timestamp starttime;
	private Timestamp endtime;
	private String content;
	private String photo;
	private String title;

	// Constructors

	/** default constructor */
	public AbstractEmergency() {
	}

	/** minimal constructor */
	public AbstractEmergency(Timestamp starttime, Timestamp endtime, String content, String title) {
		this.starttime = starttime;
		this.endtime = endtime;
		this.content = content;
		this.title = title;
	}

	/** full constructor */
	public AbstractEmergency(Administrator administrator, Timestamp starttime, Timestamp endtime, String content,
			String photo, String title) {
		this.administrator = administrator;
		this.starttime = starttime;
		this.endtime = endtime;
		this.content = content;
		this.photo = photo;
		this.title = title;
	}

	// Property accessors

	public String getId3() {
		return this.id3;
	}

	public void setId3(String id3) {
		this.id3 = id3;
	}

	public Administrator getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}