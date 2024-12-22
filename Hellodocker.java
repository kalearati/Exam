import java.util.Random;
public class Hellodocker {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Print five 4-digit random numbers
        for (int i = 0; i < 5; i++) {
            // Generate a random number between 1000 and 9999 (inclusive)
            int randomNumber = 1000 + random.nextInt(9000); // 1000 + [0..8999]
            System.out.println(randomNumber);
        }
    }
    
}

