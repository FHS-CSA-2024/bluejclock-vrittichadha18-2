package src.main.java;

public class ClockDisplay {
    protected NumberDisplay hours;
    protected NumberDisplay minutes;
    protected String display;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime() {
        return display;
    }

    protected void updateDisplay() {
        String newDisplay = hours.getDisplayValue() + ":" +
                            minutes.getDisplayValue();
        display = newDisplay;
    }
}
//CODE ABOVE HAS EVERYTHING EXCEPT CLOCK DISPLAY 12 HOUR
//CODE BELOW INCLUDES EVERYTHING ALONG WITH CLOCK DISPLAY 12 HOUR
//package src.main.java;

//public class ClockDisplay {
  //  protected NumberDisplay hours;
  //  protected NumberDisplay minutes;
  //  protected NumberDisplay seconds; // Keep seconds protected
   // protected String display;

   // public ClockDisplay() {
      //  hours = new NumberDisplay(24);
      //  minutes = new NumberDisplay(60);
      //  seconds = new NumberDisplay(60);
       // updateDisplay();
 //   }

  //  public ClockDisplay(int hour, int minute, int second) {
   //     hours = new NumberDisplay(24);
     //   minutes = new NumberDisplay(60);
      //  seconds = new NumberDisplay(60);
      //  setTime(hour, minute, second);
//    }

    //public void timeTick() {
     //   seconds.increment();
      //  if (seconds.getValue() == 0) {
        //    minutes.increment();
          //  if (minutes.getValue() == 0) {
             //   hours.increment();
          //  }
     //   }
     //   updateDisplay();
   // }

   // public void setTime(int hour, int minute, int second) {
//        hours.setValue(hour);
      //  minutes.setValue(minute);
     //   seconds.setValue(second);
     //   updateDisplay();
//    }

  //  public String getTime() {
    //    return display;
//    }

  //  protected void updateDisplay() {
  //      String newDisplay = hours.getDisplayValue() + ":" +
              //              minutes.getDisplayValue();
     //   display = newDisplay; // Update the display string
//    }
// }
