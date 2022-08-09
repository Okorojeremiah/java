package dietelProject.chapterThree;



public class ClockTest {

    public static void main(String[] args) {


        Clock quartz = new Clock(30,44,60);

        int time = quartz.setDisplayTime();
        System.out.print(time);
    }
}
