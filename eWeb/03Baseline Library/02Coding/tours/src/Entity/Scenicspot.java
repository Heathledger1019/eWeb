package Entity;

import java.math.BigDecimal;
import java.util.Set;

import AbstractClass.AbstractScenicspot;

/**
 * Scenicspot entity. @author MyEclipse Persistence Tools
 */
public class Scenicspot extends AbstractScenicspot implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Scenicspot() {
	}

	/** minimal constructor */
	public Scenicspot(String SName) {
		super(SName);
	}

	/** full constructor */
	public Scenicspot(String SName, BigDecimal STemperature, BigDecimal SHumidity, String SAirquality,
			String SPollution, String windDirection, BigDecimal windPower, String comfortDegree, Set restaurants,
			Set midscenicspots) {
		super(SName, STemperature, SHumidity, SAirquality, SPollution, windDirection, windPower, comfortDegree,
				restaurants, midscenicspots);
	}

}
