package cc3.pkg1b.carino.galong;
import java.util.Scanner;
public class CC31BCarinoGalong {

    static double mean(double[] a){
        double sum = 0;
        for (int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum = " + sum);
        return sum/a.length;
    }
    static double mode(double a[]){
        double maxValue = 0; 
        double maxCount = 0;
        for (int i=0;i<a.length;i++){
            int count = 0;
            for(int j=0; j<a.length; j++){
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }    
        return maxValue;
    }
    public static void main(String[] args) {
        
    Scanner X = new Scanner(System.in);
    System.out.print("Enter size of array = ");
    int x = X.nextInt();
    double list[] = new double[x];
    int i,num = 0;
    String input = " ";
  
    for(i=0; i<x; i++){
        System.out.print("Input value for list[" + i +"] = ");
        list[i] = X.nextInt();
    }
    
        System.out.println("Mean is: " + mean(list));
        System.out.println("Mode is: " + mode(list));
    }
    
}
