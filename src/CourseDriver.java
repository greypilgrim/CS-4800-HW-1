import Q3.*;
import java.util.*;

public class CourseDriver {
    public static void main(String[] args) {

        Instructor[] instructors1 = new Instructor[]{
                new Instructor("Nima", "Davarpanah", "3-2636")};
        TextBook[] textBooks1 = new TextBook[]{new TextBook("'Clean Code'", "Robert C. Martin Series")};

        Instructor[] instructors2 = new Instructor[]{
                new Instructor("John", "Paulson", "1-8879"),
                new Instructor("Paul", "Johnson", "1-4569")};
        TextBook[] textBooks2 = new TextBook[]{
                new TextBook("'Clean Cows'", "Robert C. Cowerton"),
                new TextBook("'Cow Designs'", "Gumma, Halm, Jergson, Vlissoo")};


        System.out.println();
        Course course1 = new Course("Software Engineering", instructors1, textBooks1);

        course1.printCourseInfo();
        System.out.println("\n");

        Course course2 = new Course("Cow Culturing", instructors2, textBooks2);

        course2.printCourseInfo();
        System.out.println();
    }
}
