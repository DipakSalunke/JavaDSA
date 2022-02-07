class Main {

	public static void main(String[] args){
	reverseArray(new int[] {1,3,4,5});
	}
	
	private static void reverseArray(int [] arr){
	
		for(int i=0; i< arr.length/2; i++){
		int other = arr.length-i-1;
		int temp = arr[i];
		arr[i] = arr[other];
		arr[other]=temp;
		}
		for(int i=0; i< arr.length;i++)
		System.out.println(arr[i]);
		
	}

}
