package src.main.java;

public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public int getLimit() {
        return limit;
    }

    public int getValue() {
        return value;
    }

    public void setLimit(int newLimit) {
        limit = newLimit;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            value = newValue;
        } else {
            System.out.println("This value is not valid");
        }
    }

    public String getDisplayValue() {
        return String.format("%02d", value); // Format as two digits
    }

    public void increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }
}
//CODE ABOVE HAS EVERYTHING EXCEPT CLOCK DISPLAY 12 HOUR
//CODE BELOW INCLUDES EVERYTHING ALONG WITH CLOCK DISPLAY 12 HOUR
//package src.main.java;

//public class NumberDisplay {
 //   private int value;
  //  private int limit;

 //   public NumberDisplay(int limit) {
  //      this.limit = limit;
  //      this.value = 0;
//    }

  //  public void increment() {
   //     value = (value + 1) % limit;
 //   }

 //   public void setValue(int value) {
    //    if (value >= 0 && value < limit) {
        //    this.value = value;
     //   }
//    }

//    public int getValue() {
//        return value;
 //   }

  //  public String getDisplayValue() {
     //   return String.format("%02d", value);
   // }
//}
