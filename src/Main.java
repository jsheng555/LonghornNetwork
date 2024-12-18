import java.io.IOException;
import java.util.*;

/**
 * The main class. Program starts running here.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the input file name as a command-line argument.");
            return;
        }
        String inputFile = args[0];
        try {
            List<UniversityStudent> students = DataParser.parseStudents(inputFile);

            for (UniversityStudent x : students) {
                System.out.println(x);
            }

            // Roommate matching
            GaleShapley.assignRoommates(students);

            // Pod formation
            StudentGraph graph = new StudentGraph(students);
            PodFormation podFormation = new PodFormation(graph);
            podFormation.formPods(4);

            // Referral path finding
            ReferralPathFinder pathFinder = new ReferralPathFinder(graph);
            // TODO: Implement user interaction for specifying a target company


            // Simulate chat message
            ChatThread chat = new ChatThread(students.get(0), students.get(1), "Hello, Bob!");
            Thread t1 = new Thread(chat);
            t1.start();

            // Simulate friend request
            FriendRequestThread friendRequest = new FriendRequestThread(students.get(1), students.get(0));
            Thread t2 = new Thread(friendRequest);
            t2.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
