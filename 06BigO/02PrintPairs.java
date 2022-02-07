class Main {

	public static void main(String[] args){
	printPairs(new int[] {1,3,4,5});
	}
	
	private static void printPairs(int [] arr){
	
		for(int i=0; i< arr.length; i++){
			for(int j=0; j< arr.length; j++){
			    if(j!=arr.length-1)
			        System.out.print(arr[i]+""+arr[j]+", ");
			    else
			        System.out.print(arr[i]+""+arr[j]);	
			}
			System.out.println();
		}
		
	}

}
