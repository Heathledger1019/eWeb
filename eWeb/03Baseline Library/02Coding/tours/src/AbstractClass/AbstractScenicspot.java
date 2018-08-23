package AbstractClass;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractScenicspot entity provides the base persistence definition of the
 * Scenicspot entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScenicspot implements java.io.Serializable {

	// Fields

	private String SId;
	private String SName;
	private BigDecimal STemperature;
	private BigDecimal SHumidity;
	private String SAirquality;
	private String SPollution;
	private String windDirection;
	private BigDecimal windPower;
	private String comfortDegree;
	private Set restaurants = new HashSet(0);
	private Set midscenicspots = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractScenicspot() {
	}

	/** minimal constructor */
	public AbstractScenicspot(String SName) {
		this.SName = SName;
	}

	/** full constructor */
	public AbstractScenicspot(String SName, BigDecimal STemperature, BigDecimal SHumidity, String SAirquality,
			String SPollution, String windDirection, BigDecimal windPower, String comfortDegree, Set restaurants,
			Set midscenicspots) {
		this.SName = SName;
		this.STemperature = STemperature;
		this.SHumidity = SHumidity;
		this.SAirquality = SAirquality;
		this.SPollution = SPollution;
		this.windDirection = windDirection;
		this.windPower = windPower;
		this.comfortDegree = comfortDegree;
		this.restaurants = restaurants;
		this.midscenicspots = midscenicspots;
	}

	// Property accessors

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public BigDecimal getSTemperature() {
		return this.STemperature;
	}

	public void setSTemperature(BigDecimal STemperature) {
		this.STemperature = STemperature;
	}

	public BigDecimal getSHumidity() {
		return this.SHumidity;
	}

	public void setSHumidity(BigDecimal SHumidity) {
		this.SHumidity = SHumidity;
	}

	public String getSAirquality() {
		return this.SAirquality;
	}

	public void setSAirquality(String SAirquality) {
		this.SAirquality = SAirquality;
	}

	public String getSPollution() {
		return this.SPollution;
	}

	public void setSPollution(String SPollution) {
		this.SPollution = SPollution;
	}

	public String getWindDirection() {
		return this.windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public BigDecimal getWindPower() {
		return this.windPower;
	}

	public void setWindPower(BigDecimal windPower) {
		this.windPower = windPower;
	}

	public String getComfortDegree() {
		return this.comfortDegree;
	}

	public void setComfortDegree(String comfortDegree) {
		this.comfortDegree = comfortDegree;
	}

	public Set getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(Set restaurants) {
		this.restaurants = restaurants;
	}

	public Set getMidscenicspots() {
		return this.midscenicspots;
	}

	public void setMidscenicspots(Set midscenicspots) {
		this.midscenicspots = midscenicspots;
	}

}