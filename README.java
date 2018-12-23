import java.io.*;
import java.util.*;
public class Maximum 
{

    public static void main(String[] args)
     {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int a = input.nextInt();
       int[] num = new int[a];
       for (int i = 0; i < a; i++)
          {
              System.out.print("");
              num[i] = input.nextInt();
          }
       System.out.println();
       {
       int  large=num[0];
       for(int j=1;j<a;j++)
            { 
              if(large<num[j])
                 {
                 large=num[j];
                 }
            }
       System.out.println(large);
        
       }
  } 
}

