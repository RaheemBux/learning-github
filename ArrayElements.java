class ArrayElements{
	public static void main(String arg[]){
		int arrayElement1[] = {10,20,30,40};
		
		
		int arrayElement2 [] = new int[4];
		 for (int i = 0; i < arrayElement1.length; i++) {     
            arrayElement2[i] = arrayElement1[i];     
        }  
		   System.out.println("first element array");
         for (int i = 0; i < arrayElement1.length; i++) {  
           
           System.out.println(arrayElement1[i] + " ");    
        }   
          System.out.println("second element array");   		
		 for (int i = 0; i < arrayElement2.length; i++) {   
           		 
           System.out.println(arrayElement2[i] + " ");
		 }
	}		 





}