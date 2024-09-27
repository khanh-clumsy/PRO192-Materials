// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;

class Main
{
   public static int[] loadData(int k)  //do not edit this function
   {int[] arr = Lib.readLineToIntArray("../Testcases/data.txt", k);
   return arr;
   }
    
  

    public static int f1(int n) {
        int sum = 0;
        
         //#######################################

        //Your code here.
        int count = 0;
        int num = 2;

        while (count < n) {
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                sum += num;
                count++;
            }
            num++;
        }

        //#######################################

        return sum;
    }
   public static void main(String args[]) throws Exception //do not edit this function
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print("Enter a integer n: ");
       int n = Integer.parseInt( in.readLine());
       System.out.println("OUTPUT:");
       System.out.println(f1(n));
       //------------------------------------------------
       int arr[] = loadData(0);
       String fname = "../Testcases/f1.sys";
       File g123 = new File(fname);
       if(g123.exists()) g123.delete();
       RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
       for (int a: arr) f.writeBytes(f1(a) + " ");
       f.close();
       //-------------------------------------------------
   }
 }
