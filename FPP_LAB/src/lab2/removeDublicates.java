package lab2;

import java.util.Arrays;

public class removeDublicates {

	
	 public static String[] removeDups(String[] data) {
	        String[] dataCopy = Arrays.copyOf(data, data.length);

	        int duplicatesCount = 0;
	        for (int x = 1; x < data.length; x++) {
	            for (int y = 0; y < x; y++) {
	                if (data[y].equals(data[x])) {
	                    dataCopy[x] = null; // set value of duplicate found to null
	                    duplicatesCount++; // increase count of duplicates
	                    break; //stop once we replace dup with null else we keep increasing the counter for every duplicate
	                }
	            }
	        }
	      
	        String[] result = new String[data.length - duplicatesCount];
	        for (int i = 0,j =0; i < dataCopy.length; i++) {
	            if (dataCopy[i] != null) {
	                result[j] = dataCopy[i];
	                j++;
	            }
	        }
	        return result;
	    }

}
