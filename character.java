package character;



public class character {
    
    static dice dice = new dice();
    
    String Name;
    int Strength;
    int Dexterity;
    int Intelligence;
    
    int Maxlifept;
    int Lifept;
   
    public character(String n, int s,int d, int i){
        
        Name = n;
        Strength = s;
        Dexterity = d;
        Intelligence = i;
        
        Maxlifept = dice.roll() + 10;
        Lifept = Maxlifept;      
    }
    
    public int attack(){
        return dice.roll() + Strength;
    }
    
    public void wound(int damage){
        this.Lifept = this.Lifept - damage;
    
    }
    
    public void heal(int heal){
        if (this.Lifept < this.Maxlifept){
            Lifept += heal;
        }
    } 
    
    
    public String getName(){
      return Name;  
    }
    
    
    public int getStrength(){
        return Strength;
    }
    
    public int getDexterity(){
        
        return Dexterity;
    }
    
    public int getIntelligence(){
        return Intelligence;
    }
    
    public int getLifept(){
        return Lifept;
    }
    
    public int getMaxlifept(){
        return Maxlifept;
    }

    
    public void setName(String Name){
        this.Name = Name;
    }
    
     public void setDexterity(int Dexterity){
        this.Dexterity = Dexterity;
    }
    
     public void setStrength(int Strength){
        this.Strength = Strength;
    }
     public void setIntelligence(int Intelligence){
        this.Intelligence = Intelligence;
    }
    
     public void setLifept(int Lifept){
        this.Lifept = Lifept;
    }
    
     public void setMaxlifept(int Maxlifept){
        this.Maxlifept = Maxlifept;
    }
       
}

    
            
            
           