package Entity;

import java.math.BigDecimal;

import AbstractClass.AbstractRestaurant;

/**
 * Restaurant entity. @author MyEclipse Persistence Tools
 */
public class Restaurant extends AbstractRestaurant implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Restaurant() {
	}

	/** minimal constructor */
	public Restaurant(String RName) {
		super(RName);
	}

	/** full constructor */
	public Restaurant(Scenicspot scenicspot, String RName, String RMore, String RCost, BigDecimal RScore) {
		super(scenicspot, RName, RMore, RCost, RScore);
	}

}
