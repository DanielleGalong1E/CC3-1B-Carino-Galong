package studentacc1;

public class Studentacc1{
    public static void main(String[] args){
        
        Studentinfo student1 = new Studentinfo();
        student1.setIdNum("18-3761-169");
        student1.setfirstname("Danielle");
        student1.setfamilyname("Galong");
        student1.setacademicprogram("BSIT");
        student1.settrack("Network and Security");
        //<object name>.<field/method>;
        student1.college = ("COA");
        //print student1's id number
        System.out.println(student1.getIdNum());
        System.out.println(student1.print());
        System.out.println("\nID Number: "+student1.getIdNum());
        System.out.println("Name: "+student1.getfamilyname()+","+student1.getfirstname());
        System.out.println("Academic Program: "+student1.getacademicprogram());
        System.out.println("Track:" +student1.gettrack());
        
      
    }
}