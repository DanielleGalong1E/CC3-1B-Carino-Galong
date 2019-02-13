package character;

import java.util.Random;
public class dice {
    private Random r ;

    public dice() {
        r= new Random();
     
    }
    
    public int roll() {//aattack
       int x = r.nextInt(5)+1;
       return x;
    }  
}
