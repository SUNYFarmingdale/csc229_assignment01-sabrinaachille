/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).

Sabrina Achille Assignemnt 1 Link: https://github.com/sabrinaachille/w1-Cousre-Assignment.git

 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
 
    private String ID;
    private String Name;
    private int Code;
    //setter
    public void setID(String id){ this.ID = id;}
    public void setName(String name){this.Name = name;}
    public void setCode(int code){this.Code = code;}
    //getters
    public String getID(){return ID;}
    public String getName(){return Name;}
    public int getCode(){return Code;}
    //constructors
    Course(){
        ID = "Unknown"; Name = "Unknown"; Code = 0;
    }
    Course(String name, String id, int code){
        ID = id; Name = name; Code = code;
    }

}
