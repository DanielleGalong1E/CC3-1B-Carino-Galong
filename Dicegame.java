package dicegame;
import java.util.Random;

public class Dicegame {

    
  private Random r;
  
  public Dicegame(){
      r = new Random();
     
    }
  
  public int roll(){
      return r.nextInt(5) + 1;
  }
    
}
