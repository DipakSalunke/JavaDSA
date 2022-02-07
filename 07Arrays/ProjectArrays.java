import java.util.*;
class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many days of tempratures? ");
        int n = sc.nextInt();
        
        TempCalculator tc = new TempCalculator(n);
        
        for(int i= 0; i< n; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            tc.addTemp(sc.nextInt(),i);
        
        }
        
        System.out.println("Average = " + tc.getAvg());
        
        System.out.println(tc.getAboveAvg() + " days above average");
    
    }
    
    
}    
   

class TempCalculator{
    int[] highTemp = null;
    int size = -1;
    
    public TempCalculator(int n){
        this.size = n;
        this.highTemp = new int [n];
        for(int i=0; i<n; i++){
            this.highTemp[i]=Integer.MIN_VALUE;
        }
    }
    
    void addTemp(int temp, int day){
        if(day<size && day >= 0)
            this.highTemp[day] = temp;
        else
            System.out.println("Enter a valid day id");
    }
    
    double getAvg(){
        int sum = 0;
        for(int i=0;i<this.size;i++){
            if(this.highTemp[i] > Integer.MIN_VALUE)
            sum+=this.highTemp[i];
        }
        
       return sum/this.size;
   }
   
   int getAboveAvg(){
       double avg = this.getAvg();
       int cnt = 0;
        for(int i=0;i<this.size;i++){
            if(this.highTemp[i]>avg){
            cnt++;
            }
        }
        return cnt;
    }
    
}
    
    
        
    
