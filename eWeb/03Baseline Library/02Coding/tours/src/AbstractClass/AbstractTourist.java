package AbstractClass;

import java.util.HashSet;
import java.util.Set;

import Entity.Complaint;
import Entity.Hotel;

/**
 * AbstractTourist entity provides the base persistence definition of the
 * Tourist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTourist implements java.io.Serializable {

	// Fields

	private String phone;
	private String passwd;
	private Set<Hotel> hotels = new HashSet(0);
	private Set<Complaint> complaints = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTourist() {
	}

	/** minimal constructor */
	public AbstractTourist(String passwd) {
		this.passwd = passwd;
	}

	/** full constructor */
	public AbstractTourist(String passwd, Set hotels, Set complaints) {
		this.passwd = passwd;
		this.hotels = hotels;
		this.complaints = complaints;
	}

	// Property accessors

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(Set<Hotel> hotels) {
		this.hotels = hotels;
	}

	public Set<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(Set<Complaint> complaints) {
		this.complaints = complaints;
	}

	

}