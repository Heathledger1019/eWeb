package Entity;

import java.util.Set;

import AbstractClass.AbstractAdministrator;

/**
 * Administrator entity. @author MyEclipse Persistence Tools
 */
public class Administrator extends AbstractAdministrator implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Administrator() {
	}

	/** minimal constructor */
	public Administrator(String name, Boolean sex) {
		super(name, sex);
	}

	/** full constructor */
	public Administrator(String name, Boolean sex, Set emergencies) {
		super(name, sex, emergencies);
	}

}
