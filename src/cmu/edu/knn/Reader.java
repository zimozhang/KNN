package cmu.edu.knn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is to read the origin files.
 * Use BufferedReader to read by lines.
 * Save each line to DataSet type.
 * Then put the data set into an ArrayList.
 * 
 * @author zimo
 *
 */
public class Reader {

	@SuppressWarnings("resource")
	public ArrayList<DataSet> readDataFile(String filename) {

		BufferedReader trainReader = null;
		ArrayList<DataSet> train = new ArrayList<DataSet>();
		
		
		try {
			trainReader = new BufferedReader(new FileReader(filename));

			String line = trainReader.readLine();
			String splitBy = ",";
			
			
			int skip = 1;
		
			while ((line = trainReader.readLine()) != null) {
				if (--skip >= 0)
					continue;
				String[] lines = line.split(splitBy);	
						
				
				double[] data = new double[lines.length-1];
				String type = null;
				DataSet tmp = new DataSet(data, type);
//				train = TrainSet[lines.length-1] ;
				
				
				for (int i=0; i<lines.length-1; i++) {
					data[i] = Double.parseDouble(lines[i]);	
					//System.out.println(data[i]);
				}
				
				
				type =lines[lines.length-1];
				
				tmp.setdata(data);
				tmp.settype(type);
				train.add(tmp);
				
				
//				System.out.println(tmp.getdata());
			}
			
//			System.out.println(train.get(0).getdata()[1]);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	 return train;
	}

}