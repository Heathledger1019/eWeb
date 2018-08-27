package Entity;

import java.util.Set;
import AbstractClass.AbstractTourist;

/**
 * Tourist entity. @author MyEclipse Persistence Tools
 */
public class Tourist extends AbstractTourist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tourist() {
	}

	/** minimal constructor */
	public Tourist(String passwd) {
		super(passwd);
	}

	/** full constructor */
	public Tourist(String passwd, Set hotels, Set complaints) {
		super(passwd, hotels, complaints);
	}

}
