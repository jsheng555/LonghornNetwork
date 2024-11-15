import java.io.*;
import java.util.*;

/**
 * Reads in the Student data from the input file and parses them into a List
 */
public class DataParser {
    /**
     * Parses the Students that are input
     * @param filename the file to read Students from
     * @return the list of UniversityStudents
     * @throws IOException throws an IOException if reading the file fails
     */
    public static List<UniversityStudent> parseStudents(String filename) throws IOException {
        List<UniversityStudent> result = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(new File(filename));
        } catch (Exception e) {
            System.out.println("Could not find input file: " + filename);
            throw e;
        }

        try {
            // Parse the student
            while (sc.hasNext()) {
                sc.nextLine(); // skip "Student:"
                String name = sc.nextLine().split(": ")[1];
                int age = Integer.parseInt(sc.nextLine().split(": ")[1]);
                String gender = sc.nextLine().split(": ")[1];
                int year = Integer.parseInt(sc.nextLine().split(": ")[1]);
                String major = sc.nextLine().split(": ")[1];
                double GPA = Double.parseDouble(sc.nextLine().split(": ")[1]);
                List<String> roommatePreferences = Arrays.asList(sc.nextLine().split(": ")[1].split(", "));
                List<String> previousInternships = Arrays.asList(sc.nextLine().split(": ")[1].split(", "));

                UniversityStudent s = new UniversityStudent(name, age, gender, year, major, GPA, roommatePreferences, previousInternships);
                result.add(s);

                if (sc.hasNextLine()) sc.nextLine(); // skip the blank line
            }

            return result;

        } catch (Exception e) {
            System.out.println("Input file is not correctly formatted.");
        }

        return new ArrayList<>();
    }
}
