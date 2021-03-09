class Student {
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    @Override
    public String toString() // Mandatory to be public
    {
        return rollno + " " + name;
    }
}

public class ToString {
    public static void main(String args[]) {

        Student s1 = new Student(1, "Umang");
        System.out.println(s1);
    }
}
