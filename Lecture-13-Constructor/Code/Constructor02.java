public class Constructor02 {
    public static void main(String[] args) {
        Boy s1 = new Boy("Rohit", 28, 102, "IIT G");

       System.out.println(s1.name);
       System.out.println(s1.age);
       System.out.println(s1.rollNumber);
       System.out.println(s1.college);

       Boy s2 = new Boy();
    }
}

class Boy {
    String name; 
    int age; 
    int rollNumber;
    String college;

    // default connstructor
    Boy() {
    }

    Boy(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }

    void markAttendance() { 
        System.out.println("Attendance marked for Boy " + name);
    }
}
