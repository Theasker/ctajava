package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
    public static void main(String[] args){
        Set<ComparableStudent> studentList = new TreeSet<>();
        
        studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
        studentList.add(new ComparableStudent("John Adams", 2222, 3.9));
        studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
               studentList.add(new ComparableStudent("John Adams", 4444, 3.0));
        for(ComparableStudent student:studentList){
            System.out.println(student);
        }
        
        
//        List<ComparableStudent> studentList = new ArrayList();
//        
//        studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
//        studentList.add(new ComparableStudent("John Adams", 2222, 3.9));
//         studentList.add(new ComparableStudent("John Adams", 4444, 3.0));
//        studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
//        Collections.sort(studentList) ;   
//        for(ComparableStudent student:studentList){
//            System.out.println(student);
//        }
    }
}
