package AbstractClass;

import java.util.HashSet;
import java.util.Set;

import Entity.Emergency;

/**
 * AbstractAdministrator entity provides the base persistence definition of the
 * Administrator entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdministrator implements java.io.Serializable {

	// Fields

	private Integer id2;
	private String name;
	private Boolean sex;
	private Set<Emergency> emergencies = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAdministrator() {
	}

	/** minimal constructor */
	public AbstractAdministrator(String name, Boolean sex) {
		this.name = name;
		this.sex = sex;
	}

	/** full constructor */
	public AbstractAdministrator(String name, Boolean sex, Set emergencies) {
		this.name = name;
		this.sex = sex;
		this.emergencies = emergencies;
	}

	// Property accessors

	public Integer getId2() {
		return this.id2;
	}

	public void setId2(Integer id2) {
		this.id2 = id2;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Set<Emergency> getEmergencies() {
		return emergencies;
	}

	public void setEmergencies(Set<Emergency> emergencies) {
		this.emergencies = emergencies;
	}


}