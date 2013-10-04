
package cata1;

import java.util.Date;

public class Cata1 {

    
    public static void main(String[] args) {
       Student pepe = new Student("Juan",new Date(91,11,2));
       System.out.println(pepe.getBirthDate());
    }
}