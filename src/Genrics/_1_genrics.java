package Genrics;



 

class _1_genrics
{ 
 // Declaration of generic function
 // Type parameters defined before 
 // return type
 public static<T> int count(T arr[], T x)
 {
     int res = 0;
     
     // Traverse the array
     for(T e: arr)
     {
         if (e.equals(x))
             res++;
     }
     return res;
 }
 public static void main(String[] args) 
 { 
     Integer arr[] = {10, 20, 30, 40, 10, 30};
     System.out.println(count(arr, 10));
 } 
} 


