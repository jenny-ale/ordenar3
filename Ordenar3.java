
package ordenar3;

import java.util.Scanner;


public class Ordenar3 {

    
    public static void main(String[] args) {
    
        Scanner lec= new Scanner(System.in);
       
       int a,b,c;
       System.out.println("introduzca un numero");
       a=lec.nextInt();
       
       System.out.println("introduzca un numero");
       b=lec.nextInt();
       
       System.out.println("introduzca un numero");
       c=lec.nextInt();
       
       
       
       if(a>b && a>c){
           if(b>c){
            System.out.println(a);
             System.out.println(b);
              System.out.println(c);
           } else {
            System.out.println(a);
             System.out.println(c);
              System.out.println(b);
           }
    }  else  if(b>a && b>c){
                if(a>c){
                  System.out.println(b);
                   System.out.println(a);
                    System.out.println(c);
                } else {
                  System.out.println(b);
                   System.out.println(c);
                    System.out.println(a);
                    }
           
    } else if(a>b){
             System.out.println(c);
              System.out.println(a);
               System.out.println(b);
    }  else {
             System.out.println(c);
              System.out.println(b);
               System.out.println(a);
            }    
        
    }
    
}
