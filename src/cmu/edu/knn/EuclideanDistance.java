package cmu.edu.knn;

/**
 * This class is to calculate the Euclidean Distance.
 * Use the formula below.
 * Distance((x1,x2,...,xn),(y1,y2,...,yn))=sqrt((x1-y1)^2+...+(xn-yn)^2).
 * 
 * @author zimo
 *
 */
public class EuclideanDistance {
	
	public double getDistance(double[] point1, double[] point2) {
		int numberOfFeather = point1.length;
		double sum = 0d;
		double result = 0d;
		
		for (int i = 0; i < numberOfFeather; i++) {
			sum += Math.pow(point1[i] - point2[i], 2);
		}
		result = Math.sqrt(sum);
		
		return result;
	}

}
