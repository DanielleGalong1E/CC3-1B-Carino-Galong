package studentacc1;
 
public class Studentinfo{
    
    String university;
    String college;
    String term;
   
    private String IdNum;
    private String familyname;
    private String firstname;
    private String academicprogram;
    private String track;
    
    Studentinfo(){
    this.university = "University of the Cordilleras";
    this.college = "College of Information Technology and Computer Science";
    this.term = "2018-2019";

    }
    
    
    public String getIdNum(){
        return IdNum;
    }
    
    public void setIdNum(String IdNum){
        this.IdNum = IdNum;
    }
    public String getfamilyname(){
        return familyname;
    }
    public void setfamilyname(String familyname){
        this.familyname = familyname;
    }
    public String getfirstname(){
        return firstname;
    }
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    public String getacademicprogram(){
        return academicprogram;
    }
    public void setacademicprogram(String academicprogram){
        this.academicprogram = academicprogram;
    }
    public String gettrack(){
        return track;
    }
    public void settrack(String track){
        this.track = track;
    }
    public String print(){
        
        System.out.println("");
        return this.university +"\n"+ this.college+"\n"+ this.term;
    }
     
}