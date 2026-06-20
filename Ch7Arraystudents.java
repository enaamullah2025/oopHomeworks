
package ch7arraystudents;


public class Ch7Arraystudents {
    public static void main(String[] args) {
       String[][] students= {
                             {"102","ali","ahmadi","a"},
                             {"103","ahmad","nazari","b"},
                             {"104","layla","khuramay","c"}
                         };
        for(int x=0;x<students.length;x++){
            for(int y=0;y<students[x].length;y++){
            System.out.print(students[x][y]+" ,");}
            System.out.println();



        
    }
    }
}
