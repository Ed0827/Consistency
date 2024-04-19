public class Consistency {
    // Field to track whether a goal has been accomplished
    private boolean goalAccomplished;

    public static void main(String[] args) {
        // Create an instance of Consistency
        Consistency consistency = new Consistency();
        
        // Set the goal as accomplished
        consistency.setGoalAccomplished(true);
        
        // Check if the goal is accomplished and provide a reward if so
        if (consistency.isGoalAccomplished()) {
            consistency.reward();
        }
    }

    /**
     * Prints a message to the console.
     */
    private void print() {
        System.out.println("Consistency");
    }

    /**
     * Example method to demonstrate a loop that skips certain iterations.
     */
    private void howto() {
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                i++; // Skip the iteration when i is 1
            }
            // Example action for other iterations
            System.out.println("Iteration " + i);
        }
    }

    /**
     * Prints a congratulatory message to the console when a goal is accomplished.
     */
    private void reward() {
        System.out.println("Congratulations, you have won a reward!");
    }

    /**
     * Returns true if the goal is accomplished.
     * @return true if the goal is accomplished, false otherwise
     */
    public boolean isGoalAccomplished() {
        return goalAccomplished;
    }

    /**
     * Sets the goal accomplishment state.
     * @param goalAccomplished true if the goal is accomplished, false otherwise
     */
    public void setGoalAccomplished(boolean goalAccomplished) {
        this.goalAccomplished = goalAccomplished;
    }
}
