public class StudentProfileSystem {

    static class Student {
        String studentId;
        String name;
        int age;
        String course;
        double mark;

        Student(String studentId, String name, int age, String course, double mark) {
            this.studentId = studentId;
            this.name = name;
            this.age = age;
            this.course = course;
            this.mark = mark;
        }

        String getGrade() {
            if (mark >= 80) {
                return "A";
            } else if (mark >= 70) {
                return "B";
            } else if (mark >= 60) {
                return "C";
            } else if (mark >= 50) {
                return "D";
            } else {
                return "F";
            }
        }

        String getResult() {
            if (mark >= 50) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        void displayProfile() {
            System.out.println("Student Profile");
            System.out.println("---------------");
            System.out.println("Student ID: " + studentId);
            System.out.println("Name      : " + name);
            System.out.println("Age       : " + age);
            System.out.println("Course    : " + course);
            System.out.printf("Mark      : %.2f%n", mark);
            System.out.println("Grade     : " + getGrade());
            System.out.println("Result    : " + getResult());
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(
                "STU1001",
                "Alex Tan",
                18,
                "Java Programming",
                86.5
        );

        student1.displayProfile();
    }
}
