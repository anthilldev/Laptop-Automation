import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;

public class Robotics {

    // Create an instance of Robot class
    Robot robot;

    public void sleep() throws InterruptedException {
        Thread.sleep(500);
    }

    public void sleepLonger() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void pressEnter(){
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void back(){
        //robot.keyPress(KeyEvent.VK_BKSP);
    }

    public void keys() throws InterruptedException{
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_X);
        sleep();
        robot.keyRelease(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        sleep();
        robot.keyPress(KeyEvent.VK_I);
        sleep();
        robot.keyRelease(KeyEvent.VK_I);
        }

    public void openChrome() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        sleep();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        sleep();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        sleep();
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        sleep();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        sleep();
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        sleep();
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        sleep();
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        sleep();
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        sleep();
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        sleep();
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        sleep();
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
    }

    public void searchChrome() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        sleep();
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        sleep();
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        sleep();
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        sleep();
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        sleep();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        sleep();
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        sleep();
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        sleep();
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
    }


   public void Robotics() throws IOException,
   AWTException, InterruptedException {
    robot = new Robot();

    try {
        Thread.sleep(2000);
    }
    catch (InterruptedException e)
    {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    // Press keys using robot. A gap of
    // of 5000 mili seconds is added after
    // every key press
    keys();
    sleepLonger();

    //Searches google for youtube
    openChrome();
    sleep();
    pressEnter();
    sleep();
    searchChrome();
    pressEnter();
   }
}
