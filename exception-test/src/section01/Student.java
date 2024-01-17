package section01;

public class Student {
    int studentID;
    String name;
    int grade;

    public Student(int studentID, String name, int grade){
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    //    public void showInfo() {
//        System.out.println("학번 = " + studentID + "이름 = " + name);
//    }
}
