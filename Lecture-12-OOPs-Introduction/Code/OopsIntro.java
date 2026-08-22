public class OopsIntro {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rounak";
        s1.age = 22;
        s1.rollNum = 161;
        s1.college = "Noida International University";

        s2.name = "Altaf";
        s2.age = 23;
        s2.rollNum = 162;
        s2.college = "Galgotia University";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNum;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by " +name);
    }

    void print(){
        System.out.println(name +"," +age +"," +rollNum + "," +college);
    }
}