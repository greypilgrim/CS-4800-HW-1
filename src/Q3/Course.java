package Q3;
import java.lang.reflect.Array;
import java.util.*;

public class Course {
    private Instructor[] instructors;
    private TextBook[] textBooks;
    private String courseName;

    public Course(String courseName, Instructor[] instructors, TextBook[] textBooks){
        this.setInstructors(instructors);
        this.setTextBooks(textBooks);
        this.setCourseName(courseName);
    }
    protected void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    protected String getCourseName() {
        return this.courseName;
    }

    protected void setInstructors(Instructor[] instructors){
        this.instructors = instructors;
    }
    protected Instructor[] getInstructorList(){
        return this.instructors;
    }

    protected void setTextBooks(TextBook[] textBooks){
        this.textBooks = textBooks;
    }
    protected TextBook[] getTextBookList(){
        return this.textBooks;
    }

    public void printCourseInfo(){
        System.out.print("Course Name: " + this.getCourseName() + "\nInstructor(s): ");
        for(Instructor currInstructor : this.getInstructorList()){
            if(this.getInstructorList().length > 1){
                System.out.print(currInstructor.getInstrFirstName() + " "
                        + currInstructor.getInstrLastName() + " " + currInstructor.getInstrOfficeNum() + " | ");
            }
            else{
                System.out.print(currInstructor.getInstrFirstName() + " "
                        + currInstructor.getInstrLastName() + " " + currInstructor.getInstrOfficeNum());
            }

        }
        System.out.print("\nText Book(s): ");
        for(TextBook currBook : this.getTextBookList()){
            if(this.getTextBookList().length > 1){
                System.out.print(currBook.getBookTitle() + " by "
                        + currBook.getBookAuthor() + " | ");
            }
            else{
                System.out.print(currBook.getBookTitle() + " by "
                        + currBook.getBookAuthor());
            }
        }
    }
}
