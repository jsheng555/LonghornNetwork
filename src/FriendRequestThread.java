/**
 * Simulates a friend request sent from one student to another using a thread
 */
public class FriendRequestThread implements Runnable {
    private final UniversityStudent sender;
    private final UniversityStudent receiver;

    /**
     * Friend request thread constructor.
     * @param sender The sender student
     * @param receiver The receiver student
     */
    public FriendRequestThread(UniversityStudent sender, UniversityStudent receiver) {
        // Constructor
        this.sender = sender;
        this.receiver = receiver;
    }

    /**
     * What to do when the thread is run
     */
    @Override
    public void run() {
        // Method signature only
        System.out.println(sender.name + " sent a friend request to " + receiver.name + ".");
    }
}
