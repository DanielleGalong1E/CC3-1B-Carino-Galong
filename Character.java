
package dicegame;


public class Character {
    static Dicegame dice = new Dicegame();
    
    String Name;
    int Strength;
    int Dexterity;
    int Intelligence;
    
    int Maxlifept;
    int Lifept;
    
    int Maxpower;
    int Currentpower;
    
    public Character(String n, int s, int d, int i){
        
        Name = n;
        Strength = s;
        Dexterity = d;
        Intelligence = i;
        
        Maxlifept = dice.roll() + 45;
        Lifept = Maxlifept;
        
        Maxpower = dice.roll() + 20;
        Currentpower = Maxpower;
    }
    
    public int attack(int attack)  {
        return attack = dice.roll() + Strength;
    }
    
    public int spellcasting(int spellcasting){
        if(this.Currentpower <= 5);
            this.Currentpower -= 5;
            return dice.roll();
    }
    
    public int wound(int damage){
        return this.Lifept = this.Lifept - damage;
    }
    
    public void heal(int heal){
        if(this.Lifept < this.Maxlifept){
            Lifept += heal;
        }
    }
    
    
    public void setName(String n){
        this.Name = n;
    }
    public void setDexterity(int d){
        this.Dexterity = 10;
    }
    public void setStrength(int s){
        this.Strength = 10;
    }
    public void setIntelligence(int s){
        this.Intelligence = 10;
    }
    public void setLifept(int Lifept){
        this.Lifept = Lifept;
    }
    public void setMaxlifept(int Maxlifept){
        this.Maxlifept = Maxlifept;
    }
    public void setCurrentmagic(int Currentmagic){
        this.Currentpower = Currentmagic;
    }
    public void setMaxmagic(int Maxmagic){
        this.Currentpower = Maxmagic;
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
    public int getCurrentmagic(){
        return Currentpower;
    }
    public int getMaxmagic(){
        return Currentpower;
    }
}
