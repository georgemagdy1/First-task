/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enctius;

class Person{
    String name1;
    String name2;
    int age;
    String email;
    public void firstname(){
    System.out.println("first Name:"+name1);
    
  
}
    public void lastname(){
        System.out.println("Last Name:"+name2);
    }
    public void age(){
        if(age>=22){
            System.out.println(name1+"is student");
        }else{
            System.out.println(name1+"graduatestudent");
        }
        System.out.println("age:"+age);
    }
    public void Email(){
        System.out.println("Email is"+email);
}
}
class graduatestudent extends Person{
    
    String projectTitle;
    public void projectTitle(){
        System.out.println("projectTitle:"+ projectTitle);
       
    }
}
class students extends Person{
    
    int id;
    
    public void studentId(){
         System.out.println(name1+"is student");
    
    
}
    public void id(){
          System.out.println("ID:"+id);
    }
   
}

public class Enctius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        students s=new students();
        s.name1="George";
        s.name2="magdy";
        s.age=22;
        s.email="GEo@.com";
        s.id=12155; 
       
        s.firstname();
        s.lastname();
        s.Email();
        s.age();
        s. studentId();
        s.id();
        graduatestudent g=new graduatestudent();
        g.projectTitle="make project";
        g.projectTitle();
      
        
    }
    
}

