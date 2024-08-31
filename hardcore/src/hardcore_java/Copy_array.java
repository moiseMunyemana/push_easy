package hardcore_java;

public class Copy_array {

	public static void main(String[] args) {
		int arr[] = {3, 2, -1, 9, -8, 6, -2,-15, 20,11,-13};
		int output[];  
       output = new int[arr.length];    
          
       for (int i = 0; i < arr.length; i++) {     
           output[i] = arr[i];     
       }      
        
       System.out.println("Elements of original array: ");    
       for (int i = 0; i < arr.length; i++) {     
          System.out.print(arr[i] + " ");    
       }     
           
       System.out.println();    
           
        
       System.out.println("Elements of new array: ");    
       for (int i = 0; i < output.length; i++) {     
          System.out.print(output[i] + " ");    
       }     
		}
	}

