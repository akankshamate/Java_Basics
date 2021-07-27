package WorkOnStream;
import java.util.*;

/**
 * @author akanksha
 * {@code City} have member values City Name and its RTO code numbers.
 *	It also has setter and getter methods.
 *
 */

public class City {
	
	private String cityName;
	private int rtoCode;
	
	/**
	 * Initializes a newly created {@code City} object by using this keyword.
	 * @param rtoCode
	 * @param cityName
	 */
	public City(int rtoCode,String cityName) {
		this.rtoCode=rtoCode;
		this.cityName=cityName;
	}
	
	/**
	 * 
	 * @param rtoCode this set the value in differnt instance value
	 */
	public void setRTOCode(int rtoCode) {
		this.rtoCode=rtoCode;
	}
	
	/**
	 * 
	 * @return rtoCode integer value RTO Code has been return from this function
	 */
	public int getRTOCode() {
		return rtoCode;
	}
	
	/**
	 * 
	 * @param cityName this set the value in differnt instance value
	 */
	public void setCityName(String cityName) {
		this.cityName=cityName;
	}
	
	/**
	 * 
	 * @return cityName String value name of city has been return from this function
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * 
	 * display() prints the {@value getRTOCode()} and  {@value getCityName()}
	 */
	public void display() {
		System.out.println("RTO code:"+getRTOCode()+"  City name:"+getCityName());
	}
	

}
