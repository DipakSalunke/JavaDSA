class Main {
	public static void main(String[] args){
		spofArray(new int [] {1,5,4,3,2});
	}

	private static void spofArray(int [] array){
		int sum = 0;
		int product = 1;

		for(int i=0; i<array.length;i++){
			sum += array[i];
		}

		for (int i=0; i< array.length;i++){
			product *=array[i];
		}

		System.out.println(sum + ", " + product);
	}

}
