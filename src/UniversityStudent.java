import java.util.*;

/**
 * The concrete class of a UniversityStudent that can be instantiated to make Student objects.
 */
public class UniversityStudent extends Student {
    // TODO: Constructor and additional methods to be implemented

    /**
     * Constructs a UniversityStudent with the given parameters.
     * @param name UniversityStudent's name
     * @param age UniversityStudent's age
     * @param gender UniversityStudent's gender
     * @param year UniversityStudent's year (1..4)
     * @param major UniversityStudent's major
     * @param gpa UniversityStudent's GPA
     * @param roommatePreferences UniversityStudent's roommate preferences
     * @param previousInternships UniversityStudent's previous internships
     */
    public UniversityStudent(String name, int age, String gender, int year, String major, double gpa, List<String> roommatePreferences, List<String> previousInternships) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.major = major;
        this.gpa = gpa;
        this.roommatePreferences = roommatePreferences;
        this.previousInternships = previousInternships;
    }

    @Override
    public String toString() {
        return name + "\n" + age + "\n" + gender + "\n" + year + "\n" + major + "\n" + gpa + "\n" + roommatePreferences + "\n" + previousInternships;
    }

    /**
     * @param other the other student to calculate the connection strength to
     * @return the connection strength between the two students
     */
    @Override
    public int calculateConnectionStrength(Student other) {
        return 0;
    }
}

