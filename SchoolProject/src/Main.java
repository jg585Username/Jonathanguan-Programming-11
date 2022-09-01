
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<School> directory = new ArrayList<>(); //Using ArrayList class - created a new ArrayList to hold school directory info in School class
        School MrChin = new School(1, 1, "Paul Chin - Department Head for Social Studies");  //make a new element to add to list using the constructor in School class
        directory.add(MrChin); //use ArrayList built in method "add" to add above information to directory array list
        School MrZhang = new School(2, 1, "Phil Zhang - Department Head for Mathematics");
        directory.add(MrZhang);
        School MrBotha = new School (3, 1, "Adriaan Botha - Department Head for Science");
        directory.add(MrBotha);

        System.out.println("Directory:");
        for (int i = 0; i < directory.size(); i++) {  //for loop with ArrayList class size method (returns integer of size of list)
            System.out.println("Rm: " + directory.get(i).getRoomNumber() + "\t" + "Floor: " + directory.get(i).getFloorNumber()
                    + "\t" + "Teacher: " + directory.get(i).getOtherNotes()); //gets (using getters, prebuilt method in java) the info stored in the private variables and prints it out (the directory)
        }

        System.out.println("-------------------------");
        ArrayList<Teacher> teachers = new ArrayList<>(); //Using ArrayList class - created a new ArrayList to hold list of teachers in Teacher class (added 3 teachers)
        Teacher PaulChin = new Teacher("Paul", "Chin", "Socials"); //make a new element to add to list using the constructor in Teacher class
        teachers.add(PaulChin); //use ArrayList built in method "add" to add above information to teachers array list
        Teacher PhilZhang = new Teacher("Phil", "Zhang", "Math");
        teachers.add(PhilZhang);
        Teacher AdriaanBotha = new Teacher("Adriaan", "Botha", "Science");
        teachers.add(AdriaanBotha);

        System.out.println("Staff:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Name: " + teachers.get(i).getFirstName() + "\t" + teachers.get(i).getLastName()
                    + "\t" + "Subject: " + teachers.get(i).getSubject()); //gets (using getters, prebuilt method in java) the info stored in the private variables and prints it out (Staff list)
        }

        ArrayList<Student> students = new ArrayList<>(); //Using ArrayList class - created a new ArrayList to hold list of students in Student class (added 10 students)
        Student JamesYipp = new Student("James", "Yipp", "8", (int) (Math.random() * 100000)); //make a new element to add to list using the constructor in Student class
        students.add(JamesYipp); //use ArrayList built in method "add" to add above information to students array list
        Student AdaelWong = new Student("Adael", "Wong", "8", (int) (Math.random() * 100000)); //"random" method generates a random StudentNo on Student class constructor
                                                                                                                                    //within range of 100000
        students.add(AdaelWong);
        Student JohnMalley = new Student("John", "Malley", "8", (int) (Math.random() * 100000));
        students.add(JohnMalley);
        Student KarlScholz = new Student ("Karl", "Scholz", "9", (int) (Math.random() * 100000));
        students.add(KarlScholz);
        Student AshaWen = new Student ("Asha", "Wen", "9", (int) (Math.random() * 100000));
        students.add(AshaWen);
        Student BobWhite = new Student ("Bob", "White", "9", (int) (Math.random() * 100000));
        students.add(BobWhite);
        Student PeterDuong = new Student ("Peter", "Duong", "9", (int) (Math.random() * 100000));
        students.add(PeterDuong);
        Student IvanLiang = new Student ("Ivan", "Liang", "10", (int) (Math.random() * 100000));
        students.add(IvanLiang);
        Student JosepTenor = new Student ("Josep", "Tenor", "10", (int) (Math.random() * 100000));
        students.add(JosepTenor);
        Student ErikSunis = new Student ("Erik", "Sunis", "10", (int) (Math.random() * 100000));
        students.add(ErikSunis);

        System.out.println("Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Name: " + students.get(i).getFirstName() + "\t" + students.get(i).getLastName()
                    + "\t" + "\t" + "Grade: " + students.get(i).getGrade() + "\t" + "\t" + "StudentNo: " +  students.get(i).getStudentNumber());
        }                   //gets (using getters, prebuilt method in java) the info stored in the private variables and prints it out (student list)

        System.out.println("-------------------------");
        System.out.println("Courses offered: ");
        ArrayList<String> courses = new ArrayList<>();//Using ArrayList class - created a new ArrayList to hold list of courses using final class String
        String Sciences = ("Science 8,9,10"); //initialize string variables
        courses.add(Sciences); //use ArrayList built in method "add" to add above information to courses array list
        String Math = ("Math 8,9,10");
        courses.add(Math);
        String Socials = ("Social Studies 8,9,10");
        courses.add(Socials);
        System.out.println(courses); //print out courses offered

        System.out.println("-------------------------");

        System.out.println ("Individuals to be removed from directory: Paul Chin (Teacher: Socials), Ashley Wen (Student), Bob White (Student)"); //removing 1 teacher and 2 students
        teachers.remove(PaulChin); //use ArrayList class built in method "remove" to remove an element (a teacher) from teachers array list
        students.remove(AshaWen); //use ArrayList class built in method "remove" to remove an element (a student) from students array list
        students.remove(BobWhite);
        System.out.println ("Updating list.....");
        System.out.println("Updated Staff:");

        for (int i = 0; i < teachers.size(); i++) { //prints out updated list with remaining teachers
            System.out.println("Name: " + teachers.get(i).getFirstName() + "\t" + teachers.get(i).getLastName()
                    + "\t" + "Subject: " + teachers.get(i).getSubject());
        }
        System.out.println("Updated Students:");
        for (int i = 0; i < students.size(); i++) {  //prints out updated list with remaining students
            System.out.println("Name: " + students.get(i).getFirstName() + "\t" + students.get(i).getLastName()
                    + "\t" + "\t" + "Grade: " + students.get(i).getGrade() + "\t" + "\t" + "StudentNo: " +  students.get(i).getStudentNumber());
        }
        System.out.println("-------------------------"); //using setters method, lets say we want to replace the deleted individuals with new ones
        System.out.println ("Individuals to be added to directory: Henry Ng (Teacher: World Explorations), Steve Singh (Student), Derick Sky (Student)"); //new individuals to be added

        PaulChin.setFirstName("Henry"); //using java prebuilt method "set", it updated the variables of old teacher to fit the new desired info of our new person
        PaulChin.setLastName("Ng");
        PaulChin.setSubject("World Explorations");
        teachers.add(PaulChin); //adds "updated PaulChin" (which is now a different person) back into teachers array list

        AshaWen.setFirstName("Steve");  //we do the same here with students
        AshaWen.setLastName("Singh");
        AshaWen.setGrade("9");
        AshaWen.setStudentNumber(123213);
        students.add(AshaWen);

        BobWhite.setFirstName("Derick");
        BobWhite.setLastName("Sky");
        BobWhite.setGrade("10");
        BobWhite.setStudentNumber(956842);
        students.add(BobWhite);

        System.out.println ("Updating FINAL list.....");
        System.out.println("Teachers FINAL:");
        for (int i = 0; i < teachers.size(); i++) { //now we print out the new lists with new individuals
            System.out.println("Name: " + teachers.get(i).getFirstName() + "\t" + teachers.get(i).getLastName()
                    + "\t" + "Subject: " + teachers.get(i).getSubject());
        }
        System.out.println("Students FINAL:");
        for (int i = 0; i < students.size(); i++) { //now we print out the new lists with new individuals
            System.out.println("Name: " + students.get(i).getFirstName() + "\t" + students.get(i).getLastName()
                    + "\t" + "\t" + "Grade: " + students.get(i).getGrade() + "\t" + "\t" + "StudentNo: " +  students.get(i).getStudentNumber());
        }
        System.out.println("-------------------------");
        System.out.println ("Updating directory.....");
        //we should now also update the directory because the new teacher will be taking a different room
        MrChin.setRoomNumber(5);    //use setters method to update directory
        MrChin.setFloorNumber(2);
        MrChin.setOtherNotes("NOTE: New classroom, Mr. Ng will be replacing Mr. Chin (temporarily switching schools) for this year");

        System.out.println("New Directory:"); //print out new directory
        for (int i = 0; i < directory.size(); i++) {
            System.out.println("Rm: " + directory.get(i).getRoomNumber() + "\t" + "Floor: " + directory.get(i).getFloorNumber()
                    + "\t" + "Teacher: " + directory.get(i).getOtherNotes());
        }
    }
}
