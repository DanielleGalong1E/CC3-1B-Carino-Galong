package dicegame;
public class Characterduel {
    public static void main(String[] args){
        
        Danielle Dn = new Danielle("Dan",5,5,5);
        Jones Jn = new Jones ("Lee",5,5,5);
        
        
        int damage;
        
        // Number of Rounds
        for(int i = 1;;i++){
            System.out.println("Round" + i);
            System.out.println("*****" + "\n");
            System.out.println(Dn.getName() + " :"+ Dn.getLifept()+" LifePTs");
            System.out.println(Jn.getName() + " :"+ Jn.getLifept()+" LifePTs" +"\n");
            
            System.out.println("======================="+"\n");
 
            if((Dn.getMagic() >= 5) &&(Dn.getLifept() <= 10)){
                System.out.println("^"+ Dn.getName() + "casts kulam " + Dn.castRestore() +" LifePTs "+"\n");
                System.out.println("======================="+ "\n");
                
            }

            else{
                if((Dn.getMagic() >= 3) && (Dn.getLifept() <= 20)){
                    damage = Dn.castKulam();
                    System.out.println("*"+ Dn.getName()+ " casts kulam on"+Jn.getName()+ "with" +damage+"pts worth of damage"+"\n");
                }
           
                else{
                    damage = Dn.getMagic();
                        System.out.println("+"+ Dn.getName() + " attacks" + Jn.getName() + " with" + damage+"pts worth of damage"+"\n");
                }
                        System.out.println("=============="+"\n");
                        
                Jn.wound(damage);       
                
                if(Jn.getLifept() <= 0){
                    System.out.println("***** Winner is: " + Dn.getName()+" *****");
                    System.out.println(Dn.getName() + " :"+ Dn.getLifept()+" LifePTs");
                    System.out.println(Jn.getName() + " :"+ Jn.getLifept()+" LifePTs" +"\n");
                    break;
                }
            }
    
            if((Jn.getPotion() <= 5) && (Jn.getLifept() <= 10)){
                System.out.println("^"+ Jn.getName() + " consumes potion " + Jn.castPotion()+ " Lifepts"+"\n");
                System.out.println("===================="+"\n");
            }
            
            else{
                if((Jn.getMaxattack() >= 3) && (Jn.getLifept() <= 20)){
                    damage = Jn.castGayuma();
                    System.out.println("*"+ Jn.getName()+ "used gayuma on " +Dn.getName()+ " with " + damage + "pts worth of damage"+"\n");
                }
  
                else{
                    damage = Jn.getAttack();
                    System.out.println("*" + Jn.getName() + "attacks" + Jn.getName() + " with " + damage+"pts worth of damage"+"\n");
                }
                    System.out.println("==============="+ "\n");
                    
                    Dn.wound(damage);
                   
                    if(Dn.getLifept() <= 0){
                        System.out.println("**** Winner is:" +Dn.getName()+"*****");
                        System.out.println(Dn.getName() + " :"+ Dn.getLifept()+" LifePTs");
                        System.out.println(Jn.getName() + " :"+ Jn.getLifept()+" LifePTs" +"\n");
                        break;
                    }
                }
            }
        }
    }
