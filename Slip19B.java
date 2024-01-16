/* Write a Multithreading program in java to convert smile face into the crying face after 5 seconds. */
class EmojiThread extends Thread {
    
    
    public void run() {
        // Display smiley face
        System.out.println("Smiley Face :)");

        // Sleep for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display crying face after 5 seconds
        System.out.println("Crying Face :'(");
    }
}

public class Slip19B {
    public static void main(String[] args) {
        // Create and start the thread
        EmojiThread emojiThread = new EmojiThread();
        emojiThread.start();
    }
}
