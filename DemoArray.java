// Capatlize
// btye code (machine readable)  .class

class DemoArray{
	
	public static void main(String abc[]){
		//System.out.println("helllo welcome to our first java class!!!");
		//System.out.println("helllo welcome to our first java class from CMD!!!");
		
		String name = "A";
		String name1 = "B";
		String name2 = "C";
		String name3 = "D";
		
		// array : collection of simmilar type of objects (variables) 
		
		// variables name must be in camelCaseNotation
		
		// syntax  datatype arrayName [] = new datatype[size];
		
		// limitation : we cant remove element array , size is fix
		
		// datatype arrayName [] = {value1,value2,.......valuen}; // dense array
		
		int age [] = new int[5];
		
		// array worked on index : 0,1,2,3.....
		// 0,1,2,3,4
		
		age[0] = 20;
		age[1] = 22;
		age[3] = 18;
		age[4] = 19;
		
		int denseAge [] ={20,12,23,25,24,36};
		
		String names [] ={"A","B","C","D"};
		
		
		for(int i=0; i<names.length; i++){
			
			System.out.println(names[i]);
		}
		System.out.println("sop from github");
               System.out.println("sop from Aqsa");
		
		
		
		
	
	}	
	
}
