package dietelProject.chapterThree;

public class Clock {

   private int hour;
   private int minute;
   private int second;

   public Clock(int hour, int minute, int second) {
       this.hour = hour;
       this.minute = minute;
       this.second = second;
   }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
//        if (this.hour > 23) {
//            this.hour = 0;
//            minute = 0;
//            second = 0;
//        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
//        if (this.minute > 59) {
//            this.minute = 0;
//            hour = 0;
//            second = 0;
//        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
//        if (this.second > 59) {
//            this.second = 0;
//            hour = 0;
//            minute = 0;
//        }
    }

    public int setDisplayTime () {
        if (this.minute > 59) {
            this.minute = 0;
            hour = 0;
            second = 0;
        } else if (this.hour > 23) {
            this.hour = 0;
            minute = 0;
            second = 0;
        } else if (this.second > 59) {
            this.second = 0;
            minute = 0;
            hour = 0;
            System.out.printf("Your time is %d:%d:%d", hour, minute, second);
        }
        return setDisplayTime();
    }

}
