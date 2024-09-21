package src.main.java;

public class ClockDriver {
    public static void main(String[] args) {
        // Testing ClockDisplay
        System.out.println("Testing ClockDisplay:");
        
        ClockDisplay test1 = new ClockDisplay();
        System.out.println("\tEmpty Constructor Test - " + test1.getTime());

        ClockDisplay test2 = new ClockDisplay(2, 45); // Remove seconds
        System.out.println("\t2-Arg Constructor Test - " + test2.getTime());

        test2.setTime(5, 15); // Remove seconds
        System.out.println("\tSet Time Test - " + test2.getTime());

        testTickTime(new ClockDisplay(3, 32), "03:32", "03:33");
        testTickTime(new ClockDisplay(3, 9), "03:09", "03:10");
        testTickTime(new ClockDisplay(1, 59), "01:59", "02:00");
        testTickTime(new ClockDisplay(9, 59), "09:59", "10:00");
        testTickTime(new ClockDisplay(23, 59), "23:59", "00:00");

        // Testing ClockDisplaySeconds
        System.out.println("\nTesting ClockDisplaySeconds:");
        
        ClockDisplaySeconds secondsTest1 = new ClockDisplaySeconds();
        System.out.println("\tEmpty Constructor Test - " + secondsTest1.getTime());

        ClockDisplaySeconds secondsTest2 = new ClockDisplaySeconds(2, 45, 30);
        System.out.println("\t2-Arg Constructor Test - " + secondsTest2.getTime());

        secondsTest2.setTime(5, 15, 45); // This now works
        System.out.println("\tSet Time Test - " + secondsTest2.getTime());

        testTickTimeSeconds(new ClockDisplaySeconds(3, 32, 59), "03:32:59", "03:33:00");
        testTickTimeSeconds(new ClockDisplaySeconds(1, 0, 59), "01:00:59", "01:01:00");
        testTickTimeSeconds(new ClockDisplaySeconds(1, 59, 59), "01:59:59", "02:00:00");
        testTickTimeSeconds(new ClockDisplaySeconds(23, 59, 59), "23:59:59", "00:00:00");
    }

    private static void testTickTime(ClockDisplay clock, String before, String after) {
        System.out.println("\tTick Test Before Increment - " + clock.getTime());
        clock.timeTick();
        System.out.println("\tTick Test After Increment - " + clock.getTime());
        assert clock.getTime().equals(after) : "Expected " + after + " but got " + clock.getTime();
    }

    private static void testTickTimeSeconds(ClockDisplaySeconds clock, String before, String after) {
        System.out.println("\tTick Test Before Increment - " + clock.getTime());
        clock.timeTick();
        System.out.println("\tTick Test After Increment - " + clock.getTime());
        assert clock.getTime().equals(after) : "Expected " + after + " but got " + clock.getTime();
    }
}
//CODE ABOVE HAS EVERYTHING EXCEPT CLOCK DISPLAY 12 HOUR
//CODE BELOW INCLUDES EVERYTHING ALONG WITH CLOCK DISPLAY 12 HOUR

//package src.main.java;

//public class ClockDriver {
    //public static void main(String[] args) {
        // Testing ClockDisplaySeconds
        //System.out.println("Testing ClockDisplaySeconds:");
        
        //ClockDisplaySeconds secondsClock = new ClockDisplaySeconds(3, 30, 45);
        //System.out.println("\tInitial Time: " + secondsClock.getTime());
        //secondsClock.timeTick();
        //System.out.println("\tAfter Tick: " + secondsClock.getTime());

        // Testing ClockDisplay12Hour
        //System.out.println("\nTesting ClockDisplay12Hour:");
        
        //ClockDisplay12Hour clock12 = new ClockDisplay12Hour(10, 30, 45);
        //System.out.println("\tInitial Time: " + clock12.getTime());

        //clock12.setTime(12, 0, 0); // 12:00 PM
        //System.out.println("\tSet Time to 12:00 PM: " + clock12.getTime());

        //clock12.setTime(0, 15, 30); // 12:15 AM
       // System.out.println("\tSet Time to 0:15:30 (12:15 AM): " + clock12.getTime());

       // clock12.setTime(15, 45, 15); // 3:45 PM
       // System.out.println("\tSet Time to 15:45:15 (3:45 PM): " + clock12.getTime());
   // }
//  }
