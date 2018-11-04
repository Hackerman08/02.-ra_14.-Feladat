
package feladt_14;

import java.util.Scanner;

public class Feladt_14 {

   
    public static void main(String[] args) {
        String s = new String();
        char c;
        char exit='n';
       Scanner input = new Scanner(System.in); 
      
       System.out.println("Kérjünk be egy Stringet");
        s= input.next();
        for (int i = 0; i !='f'; i++) {
            
        
            System.out.println("Kérlek válasz");
            System.out.println("a) Nagy betűssé alakítani");
            System.out.println("b) Kisbetűssé alakítani");
            System.out.println("c) Lekérdezni a hosszát");
            System.out.println("d) Összehasonlítani egy másik stringel (string2 bekérése)");
            System.out.println("e) Egy részét kiiratni a Stringnek (a, b intervallum bekérése)");
            System.out.println("f) Kilépni");
         c = input.next().charAt(0);   
      
            
        if('f'==c){
            System.out.println("Vége");
             System.exit(0);
           
        }else if('a'==c){
             System.out.println( s.toUpperCase() ); 
        }else if('b'==c){
            System.out.println( s.toLowerCase() );
        }else if('c'==c){
            System.out.println(s.length());
        }else if('d'==c){
            String v = new String();
            System.out.println("Kérjünk be egy másik Stringet: ");
            v= input.next();
            System.out.println( s.compareTo(v) ); 
        }else if('e'==c){
             int w=0;
             int p=0;
             System.out.println("Kérem adja meg a kezdö  értéket: ");
              w= input.nextInt();
              System.out.println("Kérem adja meg a vég értéket: ");
              p= input.nextInt();
              System.out.println(s.substring(p, w));
        }else if('A'==c||'B'==c||'C'==c||'D'==c||'E'==c||'F'==c){
            System.out.println("Hiba!!!!!!!!");
        }else {
              
            }
        }
    }

}
 