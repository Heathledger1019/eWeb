package AbstractClass;

import Entity.Scenicspot;

/**
 * AbstractMidscenicspot entity provides the base persistence definition of the
 * Midscenicspot entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMidscenicspot implements java.io.Serializable {

	// Fields

	private String MId;
	private Scenicspot scenicspot;
	private String MName;

	// Constructors

	/** default constructor */
	public AbstractMidscenicspot() {
	}

	/** minimal constructor */
	public AbstractMidscenicspot(String MName) {
		this.MName = MName;
	}

	/** full constructor */
	public AbstractMidscenicspot(Scenicspot scenicspot, String MName) {
		this.scenicspot = scenicspot;
		this.MName = MName;
	}

	// Property accessors

	public String getMId() {
		return this.MId;
	}

	public void setMId(String MId) {
		this.MId = MId;
	}

	public Scenicspot getScenicspot() {
		return this.scenicspot;
	}

	public void setScenicspot(Scenicspot scenicspot) {
		this.scenicspot = scenicspot;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

}