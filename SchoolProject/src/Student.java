
public class Student { //class Student which contains all info relating to students
    //private fields so the variables cannot be affected by ones outside of Student class
    private String firstName; //will contain info for student's first name,
    private String lastName; //last name,
    private String grade;// and grade
    private int studentNumber; //will contain info for student number which will be randomized on constructor

    Student(String firstName, String lastName, String grade, int studentNumber) { //Student constructor which is a method that will set up our object (students)
        //with its desired parameters (e.g. grade)
        this.firstName = firstName; //using this keyword and accessor to set variables equal to whatever is being passed through constructor parameter
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    //setters and getters (prebuilt method in java) which allow us to access variables in private fields
    public String getFirstName() { //getters retrieve/read value of variable
        return firstName;
    }

    public void setFirstName(String firstName) { //setters can update private variables more securely
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }




}
