// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;


class Main
{
   public static String sys_str, sys_substr;
    
    public static void loadData(int k)  //do not edit this function
   {sys_str = Lib.readLineToStr("../Testcases/data.txt", k);
    sys_substr = Lib.readLineToStr("../Testcases/data.txt", k + 1);
   
   }
    

    public static String f1(String str, String substr) {
        
        String res = "";
        
        //#######################################
        
        //Your code here.
        if (str.contains(substr)){
            res = str.replace(substr, " ").trim();
            res = res.replaceAll("\\s+", " ");
        }
        else{
            res = substr + " not found!";
        }
        //#######################################
        
        return res;
    }
   public static void main(String args[]) throws Exception //do not edit this function
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print("Enter the main string: ");
       String str2 = in.readLine();
       
       System.out.print("Enter the sub-string: ");
       String substr2 = in.readLine();
       
        
       System.out.println("OUTPUT:");
       System.out.println(f1(str2,substr2));
       //------------------------------------------------
       loadData(0);
       String fname = "../Testcases/f1.txt";
       File g123 = new File(fname);
       if(g123.exists()) g123.delete();
       RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
       f.writeBytes(f1(sys_str,sys_substr));
       f.writeBytes("\n");
       loadData(2);
       f.writeBytes(f1(sys_str,sys_substr));
       f.close();
       //-------------------------------------------------
   }
 }
