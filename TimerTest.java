/**
 * This program puts the timer and its action listener to work. After the timer is started, the program puts up a message
 * dialog and waits for the user to click the OK button to stop. While the program waits for the user, the
 * current time is displayed every second. (If you omit the dialog, the program would terminate as soon as the
 * main method exits.)
 */

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
public class TimerTest {
     public static void main(String[] args) {
          var listener = new TimePrinter();
     // construct a timer that calls the listener
     // once every second
      var timer = new Timer(1000, listener);
      timer.start();
      // keep program running until the user selects "OK" 25
     JOptionPane.showMessageDialog(null, "Quit program?");
     System.exit(0);
    }
    static class TimePrinter implements ActionListener
{
public void actionPerformed(ActionEvent event)  {
System.out.println("At the tone, the time is "     + Instant.ofEpochMilli(event.getWhen()));
Toolkit.getDefaultToolkit().beep();
}
}
}