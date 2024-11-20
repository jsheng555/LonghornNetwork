import java.util.*;

/**
 * A representation of the Students' connections in a graph
 */
public class StudentGraph {
    private HashMap<UniversityStudent, List<UniversityStudent>> adjList = new HashMap<>();

    /**
     * Constructor for the StudentGraph class.
     * @param students The list of students to initialize into the graph. Does not establish connections.
     */
    public StudentGraph(List<UniversityStudent> students) {
        // TODO
        for (UniversityStudent s : students) {
            adjList.put(s, new ArrayList<UniversityStudent>());
        }
    }

    /**
     * Creates the connections between students.
     * @param student The student to attach connections to
     * @param connections A list of students to connect the student to
     */
    public void addConnection(UniversityStudent student, List<UniversityStudent> connections) {
        // TODO
        for (UniversityStudent otherStudent : connections) {
            if (!adjList.get(student).contains(otherStudent)) {
                adjList.get(student).add(otherStudent);
            }
        }
    }

    /**
     * Gets the adjacency list map of students' connections
     * @return The adjacency list map
     */
    public HashMap<UniversityStudent, List<UniversityStudent>> getAdjList() {
        return adjList;
    }
}
