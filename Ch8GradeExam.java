
package ch8gradeexam;

public class Ch8GradeExam {

    
    public static void main(String[] args) {
        //پاسخ های دانشجویان
       char[][] studentsAnswers={           
           {'A','B','C','D','E','F','A','D','E','A'},
           {'D','B','A','C','E','F','A','D','E','A'},
           {'E','D','A','C','B','E','F','A','A','D'},
           {'C','B','A','D','C','E','F','A','D','E'},
           {'A','B','C','D','E','F','A','D','E','A'},
           {'B','B','C','D','E','F','A','D','E','A'},
           {'B','B','C','D','E','F','A','D','E','A'},
           {'E','B','C','D','E','F','A','D','E','A'}          
       };
       //کلید پاسخ
       char[] key={'D','B','D','C','C','D','A','E','A','D'};
       for(int student=0;student<studentsAnswers.length;student++){
           int Corectcount=0;
           for(int question=0;question<key.length;question++){
               if(studentsAnswers[student][question]==key[question]){
                   Corectcount++;
               }
           }
            System.out.println("Student"+student+" answered " +Corectcount+" questions correctly");
       }
       
    }
    
}
