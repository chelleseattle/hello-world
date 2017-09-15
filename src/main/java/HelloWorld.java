import com.google.common.util.concurrent.RateLimiter;

public class HelloWorld {
    public static void main(String[] args) {

        // Use RateLimiter to write a loop that prints Hello World 30 times in 30 seconds, once a second.
        // Don't just print 30 times and sleep for 30 seconds. D:

        RateLimiter myRateLimiter = RateLimiter.create(1);

        for (int i = 0; i < 30; i++) {
//            myRateLimiter.acquire(1);
            System.out.println("Hello, world!");
        }


        int numPrints = 0;
        for (int i = 0; numPrints < 30; i++) {
            if (myRateLimiter.tryAcquire(1)) {
                System.out.println("Hello, world! I have spun around " + i + " times");
                numPrints++;
            }
        }


    }
}

