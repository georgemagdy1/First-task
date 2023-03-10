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
        System.out.println("age:"+age);
    }
    public void Email(){
        System.out.println("Email is"+email);
}
}
class students extends Person{
    public void Student(){
         System.out.println(name1+"is student");
    
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
        s.age=20;
        s.email="GEo@.com";
        s.firstname();
        s.lastname();
        s.Email();
        s.age();
        s.Student();
      
        
    }
    
}
