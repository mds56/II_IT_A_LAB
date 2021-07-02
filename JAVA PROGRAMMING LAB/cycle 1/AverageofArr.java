import java.util.*;
public class AverageofArr {
        public static void main(String args[]){
            int sum=0;
            float avg;
            int arr[] = new int[5];
            Scanner input = new Scanner(System.in);
            for(int i=0;i<5;i++){
              System.out.print("Enter " + i +" Element: ");
              arr[i] = input.nextInt();
            }
            for(int i=0;i<5;i++){
                sum = sum + arr[i];
              }
            
            avg = sum / 5;
            System.out.println("average of array elements : "+avg);
    }
} 