package AbstractClass;

import java.math.BigDecimal;

import Entity.Scenicspot;

/**
 * AbstractRestaurant entity provides the base persistence definition of the
 * Restaurant entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRestaurant implements java.io.Serializable {

	// Fields

	private String RId;
	private Scenicspot scenicspot;
	private String RName;
	private String RMore;
	private String RCost;
	private BigDecimal RScore;

	// Constructors

	/** default constructor */
	public AbstractRestaurant() {
	}

	/** minimal constructor */
	public AbstractRestaurant(String RName) {
		this.RName = RName;
	}

	/** full constructor */
	public AbstractRestaurant(Scenicspot scenicspot, String RName, String RMore, String RCost, BigDecimal RScore) {
		this.scenicspot = scenicspot;
		this.RName = RName;
		this.RMore = RMore;
		this.RCost = RCost;
		this.RScore = RScore;
	}

	// Property accessors

	public String getRId() {
		return this.RId;
	}

	public void setRId(String RId) {
		this.RId = RId;
	}

	public Scenicspot getScenicspot() {
		return this.scenicspot;
	}

	public void setScenicspot(Scenicspot scenicspot) {
		this.scenicspot = scenicspot;
	}

	public String getRName() {
		return this.RName;
	}

	public void setRName(String RName) {
		this.RName = RName;
	}

	public String getRMore() {
		return this.RMore;
	}

	public void setRMore(String RMore) {
		this.RMore = RMore;
	}

	public String getRCost() {
		return this.RCost;
	}

	public void setRCost(String RCost) {
		this.RCost = RCost;
	}

	public BigDecimal getRScore() {
		return this.RScore;
	}

	public void setRScore(BigDecimal RScore) {
		this.RScore = RScore;
	}

}