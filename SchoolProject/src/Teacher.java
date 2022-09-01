
public class Teacher { //class Teacher which will contain all info relating to the teachers/staff
    //private fields so the variables cannot be affected by ones outside of Teacher class
    private String firstName; //will contain info for the teacher's first name
    private String lastName; //will contain info for the teacher's last name
    private String subject; //will contain info for the subject taught by a specific teacher


    Teacher (String firstName, String lastName, String subject) { //Teacher constructor which is a method that will set up our object (teachers)
        //with its desired parameters (e.g. subject)
        this.firstName = firstName; //using this keyword and accessor to set variables equal to whatever is being passed through constructor parameter
        this.lastName = lastName;
        this.subject = subject;
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

}
