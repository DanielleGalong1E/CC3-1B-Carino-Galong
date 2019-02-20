package dicegame;
public class Danielle extends Character {
    static Dicegame dice = new Dicegame();
    
    private int Maxmagic;
    private int Magic;
    private int Restore;
    private int Shatter;
    
    public Danielle(String n, int s, int d, int i){
        super(n,s,d,i);
        
        Maxmagic = dice.roll();
        Magic = Maxmagic;
    }

    public int castKulam(){
        int Shatter = dice.roll() + super.getIntelligence();
        super.spellcasting(Shatter);
        return Shatter;
    }

   public int castRestore(){
       int Restore = dice.roll() + super.getIntelligence();
       super.heal(Restore);
       return Restore;
   }
  
   public int getMaxmagic(){
       return Maxmagic;
   }
   public int getMagic(){
       return Magic;
   }
   public int getRestore(){
       return Restore;
   }
   public int getKulam(){
       return Shatter;
   }
}
