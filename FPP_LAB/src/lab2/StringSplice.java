package lab2;

public class StringSplice {

	public static void main(String[] args) {

//        first we get the data records
		String data = Data.records;
//        we then split each record by : and add them to an productIds
		String[] lines = data.split(":");
//		we then loop through the productIds splicing the string by getting the index of the first appearance of','
//		and adding them to a productsID array
		String[] productIds = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            productIds[i] = lines[i].split(",")[0];
        }
        
        
        for (int i = 0; i < productIds.length - 1; i++) {
            for (int j = i + 1; j < productIds.length; j++) {
                if(productIds[i].substring(productIds[i].length()-1,productIds[i].length())
                		.compareTo((productIds[j].substring(productIds[j].length()-1,productIds[j].length())))>0){ 
                    // Swap productIds[i] and productIds[j]
                    String temp = productIds[i];
                    productIds[i] = productIds[j];
                    productIds[j] = temp;
                }
            }
        }
        
        
        

            for (String productId : productIds) {
                System.out.println(productId);
            }
}
}