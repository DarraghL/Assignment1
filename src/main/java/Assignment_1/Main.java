
package Assignment_1;
import Assignment_1.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Ronan", "", 23, 16415192);
        s1.setModules(new String[]{"CT4101", "CT561", "CT417"});
        s1.setCourses(new String[]{"Computer Science"});
        s1.getUsername();
        System.out.println(s1);

        Student s2 = new Student("John", "", 22, 18431241);
        s2.setModules(new String[]{"MD4101", "MD561", "MD417"});
        s2.setCourses(new String[]{"Medicine"});
        s2.getUsername();
        System.out.println(s2);

        Student s3 = new Student("Patrick", "", 21, 17942857);
        s3.setModules(new String[]{"EN4101", "EN561", "EN417"});
        s3.setCourses(new String[]{"Engineering"});
        s3.getUsername();
        System.out.println(s3);

        Student s4 = new Student("Sarah", "", 23, 16052958);
        s4.setModules(new String[]{"CM4101", "CM561", "CM417"});
        s4.setCourses(new String[]{"Commerce"});
        s4.getUsername();
        System.out.println(s4);

        Student s5 = new Student("Jane", "", 24, 19374829);
        s5.setModules(new String[]{"PH4101", "PH561", "PH417"});
        s5.setCourses(new String[]{"Physics"});
        s5.getUsername();
        System.out.println(s5);
        System.out.println("\n");




        Lecturer l1 = new Lecturer("Michael", "", 41, 1);
        l1.setModulesTeaching(new String[]{"CT123", "CT321"});
        Lecturer.getUsername();
        System.out.println(l1);

        Lecturer l2 = new Lecturer("Mary", "", 38, 2);
        l2.setModulesTeaching(new String[]{"MD4101", "MD561", "MD117"});
        Lecturer.getUsername();
        System.out.println(l2);

        Lecturer l3 = new Lecturer("Jack", "", 55, 3);
        l3.setModulesTeaching(new String[]{"CM4101", "CM511", "CM457"});
        Lecturer.getUsername();
        System.out.println(l3);

        Lecturer l4 = new Lecturer("David", "", 35, 4);
        l4.setModulesTeaching(new String[]{"EN4101"});
        Lecturer.getUsername();
        System.out.println(l4);

        Lecturer l5 = new Lecturer("Peter", "", 61, 5);
        l5.setModulesTeaching(new String[]{"PH4101", "PH561"});
        Lecturer.getUsername();
        System.out.println(l5);
        System.out.println("\n");



        Course c1 = new Course("Computer Science");
        c1.setModules(new String[]{"CT4101", "CT561", "CT417"});
        System.out.println(c1);

        Course c2 = new Course("Medicine");
        c2.setModules(new String[]{"MD4101", "MD561", "MD417"});
        System.out.println(c2);

        Course c3 = new Course("Engineering");
        c3.setModules(new String[]{"EN4101", "EN561", "EN417"});
        System.out.println(c3);

        Course c4 = new Course("Commerce");
        c4.setModules(new String[]{"CM4101", "CM561", "CM417"});
        System.out.println(c4);

        Course c5 = new Course("Physics");
        c5.setModules(new String[]{"PH4101", "PH561", "PH417"});
        System.out.println(c5);




    }



}
