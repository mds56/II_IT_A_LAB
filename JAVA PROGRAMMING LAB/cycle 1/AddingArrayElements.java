import java.util.*;
public class AddingArrayElements {
    public static void main(String args[]){
        int sum=0;
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
          System.out.print("Enter " + i +" Element: ");
          arr[i] = input.nextInt();
        }
        for(int i=0;i<5;i++){
            sum = sum + arr[i];
          }
          System.out.println("sum of array elements : "+sum);
    }
}