/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** Array of objects = java example : Printing student details
 * project = stare to github account : collaboration tool , tracking changes keep history. - version control software
 * @author iamarchar [] reverse = ner char[word.length()]; - reverse of word.
 * print 3 student details are name, age, store in array then prints -- array object
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list = new Student[3]; //array of objects decleration
        //create student 3
        Student s1 = new Student();
        s1.setName("peter");
        s1.setAge(20);
        
        list[0] =s1; // Stored object in array
        System.out.print(s1.getName() + list[0].getAge());
    }
    
}
