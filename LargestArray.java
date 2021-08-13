class LargestArray{
	public static void main(String arg[]){
		int large[]= {45,67,21,59,78};
		
		int max= large[0];
		
		for(int i=0; i<large.length; i++){
		
		if(large[i]> max)
			max=large[i];
		
	}
	System.out.println("Largest Element is:" + max);
	}


}