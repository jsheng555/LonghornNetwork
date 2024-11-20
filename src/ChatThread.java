/**
 * Simulates a chat message sent from one student to another using a thread
 */
public class ChatThread implements Runnable {
    private final UniversityStudent sender;
    private final UniversityStudent receiver;
    private final String message;

    /**
     * Chat thread constructor.
     * @param sender The sender student
     * @param receiver The receiver student
     * @param message The message that is being sent
     */
    public ChatThread(UniversityStudent sender, UniversityStudent receiver, String message) {
        // Constructor
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    /**
     * What to do when the thread is run
     */
    @Override
    public void run() {
        // TODO
        System.out.println(sender.name + " says to " + receiver.name + ": " + message);
    }
}
