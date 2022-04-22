

public class ContactRoughDraft {
    private String name;
    private int grade;

    private int age;

    private double gradeAverage;


    private String gitusername;


    public ContactRoughDraft(String name, int age) {
        this.name = name;
        this.age = 20;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    public double getGradeAverage() {
//        return gradeAverage;
//    }
//
//    public void setGradeAverage(double gradeAverage) {
//        this.gradeAverage = gradeAverage;
//    }

    public void addAge(int i) {
        this.grade = this.grade + i;
        this.gradeAverage = (double) this.grade / 3;
    }

//    public String getGrades() {
//        return "Name: " + this.name + "\nGrade: " + this.grade + "\nGrade Average: " + this.gradeAverage;
    }



//    //    a main method and creating Contact objects
//    public static void main(String[] args) {
//        Contact s1 = new Contact();
//        s1.setName("John");
//        s1.setGrade(90);
//        s1.addGrade(80);
//        s1.addGrade(70);
//        System.out.println(s1.getName() + " " + s1.getGradeAverage());
//
//        Contact s2 = new Contact();
//        s2.setName("Jane");
//        s2.setGrade(80);
//        s2.addGrade(70);
//        s2.addGrade(60);
//        System.out.println(s2.getName() + " " + s2.getGradeAverage());
//
//        Contact s3 = new Contact();
//        s3.setName("Joe");
//        s3.setGrade(70);
//        s3.addGrade(60);
//        s3.addGrade(50);
//        System.out.println(s3.getName() + " " + s3.getGradeAverage());
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//
//    public void setGrade(int grade) {
//        this.grade = grade;
//    }
//
//    public void addGrade (int grade) {
//        this.grade += grade;
//    }
//
//    public double getGradeAverage() {
//        return (double) grade / 3;
//    }
//
//    public void setGradeAverage(double gradeAverage) {
//        this.gradeAverage = gradeAverage;
//    }
//
//    public String getGrades() {
//        return "";
//    }
//}




