package Entity;

import AbstractClass.AbstractMidscenicspot;

/**
 * Midscenicspot entity. @author MyEclipse Persistence Tools
 */
public class Midscenicspot extends AbstractMidscenicspot implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Midscenicspot() {
	}

	/** minimal constructor */
	public Midscenicspot(String MName) {
		super(MName);
	}

	/** full constructor */
	public Midscenicspot(Scenicspot scenicspot, String MName) {
		super(scenicspot, MName);
	}

}
