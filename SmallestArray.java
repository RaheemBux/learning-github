class SmallestArray{
	public static void main(String arg[]){
		int large[]= {45,67,21,59,78};
		
		int min= large[0];
		
		for(int i=0; i<large.length; i++){
		
		if(large[i]< min)
			min=large[i];
		
	}
	System.out.println("Smallest Element is:" + min);
	}


}