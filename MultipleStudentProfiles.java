public class MultipleStudentProfiles {

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

        String getResult() {
            if (mark >= 50) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        void displayProfile() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Name      : " + name);
            System.out.println("Age       : " + age);
            System.out.println("Course    : " + course);
            System.out.printf("Mark      : %.2f%n", mark);
            System.out.println("Result    : " + getResult());
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("STU1001", "Alex Tan", 18, "Java", 86.5);
        Student student2 = new Student("STU1002", "Mei Ling", 19, "Python", 72.0);
        Student student3 = new Student("STU1003", "Ravi Kumar", 20, "Web Development", 48.5);

        student1.displayProfile();
        System.out.println();

        student2.displayProfile();
        System.out.println();

        student3.displayProfile();
    }
}
