package Entity;

import java.math.BigDecimal;
import java.util.Set;

import AbstractClass.AbstractHotel;

/**
 * Hotel entity. @author MyEclipse Persistence Tools
 */
public class Hotel extends AbstractHotel implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Hotel() {
	}

	/** minimal constructor */
	public Hotel(String passwd, String name, String address, String prove, String conName, String phone, String email,
			Boolean ispass) {
		super(passwd, name, address, prove, conName, phone, email, ispass);
	}

	/** full constructor */
	public Hotel(String passwd, String name, String address, String prove, String conName, String phone, String email,
			Boolean ispass, Integer number, BigDecimal cost, Set tourists) {
		super(passwd, name, address, prove, conName, phone, email, ispass, number, cost, tourists);
	}

}
