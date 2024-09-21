package src.main.java;

public class ClockDisplaySeconds extends ClockDisplay {
    private NumberDisplay seconds;

    public ClockDisplaySeconds() {
        super(); // Call the ClockDisplay constructor
        seconds = new NumberDisplay(60); // Initialize seconds
        updateDisplay(); // Update display safely
    }

    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute); // Call the ClockDisplay constructor
        seconds = new NumberDisplay(60); // Initialize seconds
        setSeconds(second); // Set seconds directly
        updateDisplay(); // Update the display
    }

    public void setSeconds(int second) {
        seconds.setValue(second); // Set the seconds value
    }

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute); // Set hours and minutes
        setSeconds(second); // Set seconds
        updateDisplay(); // Update the display
    }

    @Override
    public void timeTick() {
        seconds.increment(); // Increment seconds
        if (seconds.getValue() == 0) { // If seconds wrap around
            super.timeTick(); // Increment minutes and possibly hours
        }
        updateDisplay(); // Update display after ticking
    }

    @Override
    protected void updateDisplay() {
        // Only append seconds if they are initialized
        super.updateDisplay(); // Get HH:MM
        if (seconds != null) { // Check if seconds is initialized
            display += ":" + seconds.getDisplayValue(); // Append seconds to display
        }
    }
}

//CODE ABOVE HAS EVERYTHING EXCEPT CLOCK DISPLAY 12 HOUR
//CODE BELOW INCLUDES EVERYTHING ALONG WITH CLOCK DISPLAY 12 HOUR
//package src.main.java;

//public class ClockDisplaySeconds extends ClockDisplay {
  //  public ClockDisplaySeconds() {
      //  super();
      //  updateDisplay();
//    }

  //  public ClockDisplaySeconds(int hour, int minute, int second) {
    //    super(hour, minute, second);
    //    seconds.setValue(second); // Set the seconds value directly
   //     updateDisplay();
//    }

 //   public void setSeconds(int second) {
      //  seconds.setValue(second); // Set the seconds value
 //   }

 //   @Override
  //  public void timeTick() {
    //    super.timeTick(); // Call the parent method to handle ticking
  //  }

  //  @Override
  //  protected void updateDisplay() {
   //     super.updateDisplay(); // Fetch the HH:MM part
      //  display += ":" + seconds.getDisplayValue(); // Append seconds to the display
    //}
//}

