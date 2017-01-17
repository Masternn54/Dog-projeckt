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
public class Person {
 private String name;
 private String email;

    
  public Person(String pName,String pEmail){
     name = pName;
     email = pEmail;  
  }
  
  public String getName(){
      return name;
      
  }
  
  public String getEnamil(){
      return email;
      
  }
  public void setName(String pName){
      name = pName;
      
  }
  public void setEmail(String pEmail){
      email = pEmail;
      
  }
 @Override
  public String toString(){
      
    return name + "(mail:"+email+")";
  }
  
  
}
