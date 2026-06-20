
package ch11classuniversity;


public class Ch11classuniversity {

    
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="enaam";
        t1.age=21;
        t1.faculty="cs";
       
    }
    
}
class UniversityMember {
    
     public  String name;
      public String lastname;
     public boolean  gender;
     public int age;
     public int phone;
   public String email;
    public void attend(){
         System.out.println("the student is attending");
    } 
}
    class Teacher extends UniversityMember{
    
    String department;
    String faculty;
    String rank;
    String[] subject;
    
    void teach(){
        System.out.println("the teacher is teaching");
    }
    void takeexam(){
        System.out.println("teacher is taking exam");
    }

}
class Students extends UniversityMember{
    public String department;
    public int semester;
    public String faculty;
    public void study(){
        System.out.println(name+"the student is studying");
        
    }

}
