package AbstractClass;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import Entity.Tourist;

/**
 * AbstractHotel entity provides the base persistence definition of the Hotel
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHotel implements java.io.Serializable {

	// Fields

	private String id;
	private String passwd;
	private String name;
	private String address;
	private String prove;
	private String conName;
	private String phone;
	private String email;
	private Boolean ispass;
	private Integer number;
	private BigDecimal cost;
	private Set<Tourist> tourists = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHotel() {
	}

	/** minimal constructor */
	public AbstractHotel(String passwd, String name, String address, String prove, String conName, String phone,
			String email, Boolean ispass) {
		this.passwd = passwd;
		this.name = name;
		this.address = address;
		this.prove = prove;
		this.conName = conName;
		this.phone = phone;
		this.email = email;
		this.ispass = ispass;
	}

	/** full constructor */
	public AbstractHotel(String passwd, String name, String address, String prove, String conName, String phone,
			String email, Boolean ispass, Integer number, BigDecimal cost, Set tourists) {
		this.passwd = passwd;
		this.name = name;
		this.address = address;
		this.prove = prove;
		this.conName = conName;
		this.phone = phone;
		this.email = email;
		this.ispass = ispass;
		this.number = number;
		this.cost = cost;
		this.tourists = tourists;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProve() {
		return this.prove;
	}

	public void setProve(String prove) {
		this.prove = prove;
	}

	public String getConName() {
		return this.conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIspass() {
		return this.ispass;
	}

	public void setIspass(Boolean ispass) {
		this.ispass = ispass;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Set<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(Set<Tourist> tourists) {
		this.tourists = tourists;
	}

	

}