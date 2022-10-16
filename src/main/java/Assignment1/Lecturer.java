package Assignment1;

import java.time.LocalDate;
import java.util.Arrays;



public class Lecturer {

    private static String name, username;
    private static int age;
    private LocalDate dob;
    private int ID;
    private String[]  modulesTeaching;



    public Lecturer(String name, String username, int age, int ID){
        this.name = name;
        this.username = username;
        this.age = age;
        this.ID = ID;


    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Lecturer.name = name;
    }

    public static String getUsername() {
        username = name + age ;
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Lecturer.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String[] getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(String[] modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }



    @Override
    public String toString(){
        return username +  " Modules teaching: " + Arrays.toString(modulesTeaching);

    }





}
