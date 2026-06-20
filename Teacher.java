
package university;


public class Teacher extends UniversityMember{
    
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
