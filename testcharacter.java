package character;
public class testcharacter {
    
    public static void main(String[]args){
        
     
       character Jk = new character("Jack",0,0,0);
       character Rk = new character("Rocky",0,0,0);
       
        int damage;
        
        
        
        // Number of Rounds
        for(int i = 1;;i++){
            System.out.println("Round " + i);
            System.out.println("*****" + "\n");
            System.out.println(Jk.getName() +" : "+ Jk.getLifept()+" Lifept/s");
            System.out.println(Rk.getName() +" : "+ Rk.getLifept()+" Lifept/s"+ "\n");
            
            System.out.println("===================="+"\n");
            
            
            
            // Character: Phantom King
         
             
                  damage = Jk.attack();
                      System.out.println("*"+ Jk.getName() + " attacks " + Rk.getName() + " with " + damage+"pt/s damage"+"\n");
                    
                
                   System.out.println("===================="+"\n");
             
            Rk.wound(damage);
            
            
                  
            
            // Victory       
            if(Rk.getLifept()<=0){
            System.out.println("***** Winner is: " + Jk.getName()+" *****");
            break;
        }  
    
    
            
            
            // Character: White Knight (Sir Xavier)
           
            else{
            
                    damage = Rk.attack();
                      System.out.println("*"+ Rk.getName() + " attacks " + Jk.getName() + " with " + damage+"pt/s damage"+"\n");
                    
                }
                     System.out.println("===================="+ "\n");
                     
       
            Jk.wound(damage);
            
          
            // Victory
            if(Jk.getLifept() <=0 ){
            System.out.println("***** Winner is: " +Rk.getName()+" *****");
            break;
            }
                   
      
        }
    }
}
