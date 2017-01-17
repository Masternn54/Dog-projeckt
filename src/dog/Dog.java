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
public class Dog {

    String name;
    int age;
    private Person owner;

    public Dog(String dogname) {
       name = dogname;
       age = 0;
       
    }

    public void addyears(int years) {
        age = age + years;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int years) {
        age = age + years;
    }
    public void setOwner(Person downer ){
       owner = downer; 
}
    public Person getOwner(){
        return owner;   
    }
    public String getName() {
        return name;
    }

    public void setName(String magnus) {
        name = magnus;

    }

    public String toString() {
        return name + " er " + age + " år \n owner: "+owner;

    }
   
    
        
    
    

}




    
    

