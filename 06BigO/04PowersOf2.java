class Main {

	public static void main(String[] args){
	System.out.println("ANS: " +powersOf2(16));
	}
	
	private static int powersOf2(int n){
	    if(n<1){
	        return 0;
	    }else if ( n==1 ){
	        System.out.println(1);
	        return 1;
	    } else{
	        var prev = powersOf2(n/2);
	        var curr = prev*2;
	        System.out.println(curr);
	        return curr;
	    }
	}

}
