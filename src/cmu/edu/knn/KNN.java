package cmu.edu.knn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This is k-nearest neighbors algorithm. 
 * @author zimo
 *
 */
public class KNN {

	/**
	 * Read the original train and test files 
	 * and write the predict results to a new file.
	 */
	public static void main(String[] args) {
		String input = getInput("Enter the value of k: ");
		int k = Integer.parseInt(input);
		System.out.println("Please use "+ k + " nearest neignbors to predict the Species");
		Reader reader = new Reader();
				
		ArrayList<DataSet> train = reader.readDataFile("IrisTrain.csv");		
		ArrayList<DataSet> test = reader.readDataFile("IrisTest.csv");

		writeFile("IrisPredict.csv", k, train, test);
		
	}


  public static void writeFile(String filename, int k, ArrayList<DataSet> train, ArrayList<DataSet> test) {
    try {
		String[] predict = new String[test.size()]; 
			
			//Write prediction data to a new csv file.
		FileWriter fw = new FileWriter(filename);
		PrintWriter pw = new PrintWriter(fw);
			
			//Write the top and title of each column.
		pw.print(k + "-nearest neignbors algorithm");
		pw.println();
		pw.print("Sepal length");
		pw.print(",");
		pw.print(" Sepal width");
		pw.print(",");
		pw.print(" Petal length  ");
		pw.print(",");
		pw.print(" Petal width  ");
		pw.print(",");
		pw.print(" Species prediction");
		pw.println();
			
			//Write the test data and predict result by line.
		for (int s=0; s<test.size();s++){
			predict[s] = classify(k, train, test.get(s));
				
			for (int i = 0; i < test.get(s).getdata().length; i++) {
				pw.print(test.get(s).getdata()[i]);
				pw.print(","+"                 ");
			}
				
			pw.print(predict[s]);
			pw.println();
		}
			
        		pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
            System.out.println("Finish writing!");
}
	
	
	/**
	 * This function is to classify the type of data.
	 * Get the neighbors information from getKNeighbors.
	 * Count the number of each class in its' neighbors.
	 * Choose the one that has the biggest count to be the predict type.
	 */
	public static String classify(int k, ArrayList<DataSet> train, DataSet test) {
		
		DataSet[] result = getKNeighbors(k, train, test);
		int class1 = 0;
		int class2 = 0;
		int class3 = 0;
		
		//Iterate all the result of neighbors.
		//Count appearance of each type.
		for (DataSet i : result) {
			switch (i.gettype()) {
			case "I.�setosa":
				class1++;
				break;
			
			case "I.�versicolor":
				class2++;
				break;

			case "I.�virginica":
				class3++;
				break;
				
			default:
				System.out.println("There is something wrong with the type!");
				break;
			}
			
		}
		
		//Compare the number of three classes.
		//Choose the biggest one to be the type for the test point.
		if (class1>=class2) {
			if (class1>=class3) {
				return "I.�setosa";
			} else {
				return "I.�virginica";
			}
		} else {
			if (class2>=class3) {
				return "I.�versicolor";
			} else {
				return "I.�virginica";
			}

		}
		
		
	}
	
	/**
	 * This function is to find the K nearest neighbors in train set of a point in test set.
	 * Choose the first k distance.
	 * And compare the distance in neighbor set with the rest of train set.
	 * Replace the bigger ones with smaller ones.
	 * Finally get the k points have the nearest distance.
	 * 
	 */
	public static DataSet[] getKNeighbors(int k, ArrayList<DataSet> train, DataSet test){
		EuclideanDistance distance = new EuclideanDistance();
		int numberOfTrainset = train.size();
		DataSet[] neighbors = new DataSet[k];
		double[] dis = new double[numberOfTrainset];

		//Store the distances of the first k neighbors at the beginning.
		int index;
		for (index = 0; index < k; index++) {
			
			dis[index] = distance.getDistance(train.get(index).getdata(), test.getdata());
			neighbors[index]=train.get(index);
			neighbors[index].setdistance(dis[index]);
		}
		
		//Compare other distance in the train data 
		//with the maximum distance of current k neighbors.
		//If can find a smaller one, replace the old point in distance with the new point.
		for (index = k; index < numberOfTrainset; index++) {
			dis[index] = distance.getDistance(train.get(index).getdata(), test.getdata());
			
			int maxIndex = 0;
			for (int i = 1; i < k; i++) {
				if (neighbors[i].getdistance()>neighbors[maxIndex].getdistance()) {
					maxIndex = i;
					
				}
			}
			
			if (neighbors[maxIndex].getdistance()>dis[index]) {
				neighbors[maxIndex]=train.get(index);
				neighbors[maxIndex].setdistance(dis[index]);
			}
				
		}
//		for (int i = 0; i<k; i++) {
//			System.out.println(neighbors[i].gettype());
//		}
		
		return neighbors;
		
	}
	
	
	/**
	 * This function can only be used in this KNN class.
	 * Use the BufferedReader and InputStreamReader to read the input.
	 * Get the k defined by user.
	 */
	public static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
			
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}	
	

}
