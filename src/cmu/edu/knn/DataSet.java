package cmu.edu.knn;

/**
 * This class is to define a data type to store the data from the origin files.
 * The type contains a double array for data set, 
 * a string variable for type,
 * and double variable for distance storage. 
 * Define the basic get and set function for this variables.
 * 
 * @author zimo
 *
 */
public class DataSet {
	private double[] data;
	private String type;
	private double distance;
	
	public DataSet(){}
	
	public DataSet(double[] data, String type){
		this.data = data;
	    this.type = type;
	}
	
	public double[] getdata() {return data;}
	public String gettype() {return type;}
	public double getdistance() {return distance;}
	
	public void setdata(double[] data) {this.data = data;}
	public void settype(String type) {this.type = type;}
	public void setdistance(double distance) {this.distance = distance;}
}
