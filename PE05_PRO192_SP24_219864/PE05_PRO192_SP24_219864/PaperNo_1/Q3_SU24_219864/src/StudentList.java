
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class StudentList extends HashMap<String, Student>{ 
    public void addElement(Student student){
        this.put(student.getRollNo(), student);
    }
    public Student findStudentByRollNo(String rollNo){
        if (rollNo == null){
            return null;
        }
        String lowerRollNo = rollNo.toLowerCase();
        for (String key : this.keySet()){
            if (key.equalsIgnoreCase(lowerRollNo)){
                return this.get(key);
            }
        }
        return null;
    } 
    public float getAverageGPA(){
        float total = 0;
        int count = 0;
        for (Student student : this.values()){
            total += student.getGpa();
            count++;
        }
        return total / count;
    }
}
