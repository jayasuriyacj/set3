import java.io.*; 
import java.util.*; 
  public class Sort { 
   static void sortit(int []arr, int n) 
    { 
        for (int i = 0; i < n; i++)  
        { 
            arr[i]=i+1; 
       } 
    } 
public static void main(String args[]) 
    { 
        int []arr = {3,2,1 }; 
        int n = arr.length; 
       sortit(arr, n); 
           for (int i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    } 
} 





