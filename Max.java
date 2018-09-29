import java.util.*;
class Max
{
public static void main(String args[])
{
int large, n, i;
int arr[] = new int[50];
Scanner scan = new Scanner(System.in);
System.out.print("Enter Array Size : ");
n = scan.nextInt();
System.out.print("Enter Array Elements : ");
for(i=0; i<n; i++)
{
arr[i] = scan.nextInt();
}
 large = arr[0];
for(i=0; i<n; i++)
 {
if(large < arr[i])
 {
 large = arr[i];
}
}
System.out.print("Largest Number is = " +large); 
}
}
