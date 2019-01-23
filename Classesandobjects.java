package classesandobjects;
import java.util.Scanner;
public class Classesandobjects {
 
    public static void main(String[] args) {
        Scanner pug = new Scanner(System.in);
        
        dog blacky = new dog();
        blacky.setName("Blacky");
        String dogA = blacky.getName();
        System.out.println(dogA);
        
        System.out.print("Name: ");
        String name=pug.next();
        blacky.setName(name);
        
        System.out.print("Age: ");
        int age=pug.nextInt();
        blacky.setAge(age);
        
        System.out.print("Breed: ");
        String breed=pug.next();
        blacky.setBreed(breed);
        
        System.out.print("Gender: ");
        char gender=pug.next().charAt(0);
        blacky.setGender(gender);
    
    }    
}
