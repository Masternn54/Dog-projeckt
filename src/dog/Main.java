/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Nichlas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog d1;
       d1 = new Dog("Fido") ;
       
      Dog d2;
      d2 = new Dog("himmelhunden");
      
      d1.setAge(3);
      d2.setAge(11);
     
      Person p1;
      p1 = new Person ("Peter Jensen","lillepeter@gmail.com");
      
      d1.setOwner(p1);
      d2.setOwner(p1);  
    
      
      Person dogOwner;
     dogOwner = d2.getOwner();
     
     dogOwner.setEmail("peterjensen@gmail.com");
     
     
     
     System.out.println(d1);
      
     System.out.println(d2);
     
    
    }
}
