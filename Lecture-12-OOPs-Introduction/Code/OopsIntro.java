public class OopsIntro {
    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

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

class Students {
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