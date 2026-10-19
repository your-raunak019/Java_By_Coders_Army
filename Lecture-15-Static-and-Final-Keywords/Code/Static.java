package Code;

public class Static {

    static void main(String[] args) {

        Student s1 = new Student("Md Rounak", 21 ,108);
        Student s2 = new Student("Syed Abbas", 22 ,109);

        // Student.college = "NIU"; // if we are defining this college in the static block then we don't have to write here.

        System.out.println(s1.name + ", " +s1.age +", " +s1.rollNumber +", " +Student.college +", " +Student.Location);
        System.out.println(s2.name + ", " +s2.age +", " +s2.rollNumber +", " +Student.college +", " +Student.Location);

    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    static String college;
    static String Location;

    Student ( String name, int age, int rollNumber ){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static Block
    static {
        college = "Noida International University";
        Location = "Greater Noida";
    }
}
