package dicegame;
public class Jones extends Character {
    static Dicegame dice = new Dicegame();
    
    private int Maxattack;
    private int Attack;
    private int Lovepotion;
    
    public Jones(String n, int s, int d, int i){
        super(n,s,d,i);
        Maxattack = dice.roll();
        Attack = Maxattack;
    }
    public int castGayuma(){
        int Attack = dice.roll() + super.getDexterity();
        super.wound(Attack);
        return Attack;
    }
    
    public int castPotion(){
        int Lovepotion = dice.roll() + super.getIntelligence();
        super.heal(Lovepotion);
        return Lovepotion;
    }
    
    public int getMaxattack(){
        return Maxattack;
    }
    public int getAttack(){
        return Attack;
    }
    public int getPotion(){
        return Lovepotion;
    }
    
}
