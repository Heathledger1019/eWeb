package AbstractClass;

import java.sql.Timestamp;

import Entity.Tourist;

/**
 * AbstractComplaint entity provides the base persistence definition of the
 * Complaint entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComplaint implements java.io.Serializable {

	// Fields

	private String id4;
	private Tourist tourist;
	private Timestamp time;
	private String content;
	private String photo2;
	private Boolean ishandle;
	private Timestamp dealtime;
	private String answer;
	private String evaluate;

	// Constructors

	/** default constructor */
	public AbstractComplaint() {
	}

	/** minimal constructor */
	public AbstractComplaint(Timestamp time, String content, Boolean ishandle) {
		this.time = time;
		this.content = content;
		this.ishandle = ishandle;
	}

	/** full constructor */
	public AbstractComplaint(Tourist tourist, Timestamp time, String content, String photo2, Boolean ishandle,
			Timestamp dealtime, String answer, String evaluate) {
		this.tourist = tourist;
		this.time = time;
		this.content = content;
		this.photo2 = photo2;
		this.ishandle = ishandle;
		this.dealtime = dealtime;
		this.answer = answer;
		this.evaluate = evaluate;
	}

	// Property accessors

	public String getId4() {
		return this.id4;
	}

	public void setId4(String id4) {
		this.id4 = id4;
	}

	public Tourist getTourist() {
		return this.tourist;
	}

	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto2() {
		return this.photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public Boolean getIshandle() {
		return this.ishandle;
	}

	public void setIshandle(Boolean ishandle) {
		this.ishandle = ishandle;
	}

	public Timestamp getDealtime() {
		return this.dealtime;
	}

	public void setDealtime(Timestamp dealtime) {
		this.dealtime = dealtime;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEvaluate() {
		return this.evaluate;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

}