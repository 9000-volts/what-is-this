import javax.swing.*;
import java.awt.event.*;
import java.io.*;
// Okay, this is a really complicated java program because everything in java
// is way too complicated to accomplish your intended goal anyways.
class WeirdProgram {
  // In case you weren't aware already, this is the main method.
  public static void main(String[] args) {

    // Ok here you go again, telling info about yourself to random strangers.
    System.out.println("Oh hey, I'm that weird program everybody is talking about, and I'm starting a GUI.");
    // You really gotta break that habit, WeirdProgram. seriously, it's dangerous

    // Ok make a window and when it dies, it takes everybody down with it
    JFrame x = new JFrame("O Hai");
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Ok we need a panel to keep everything in all nice and snug
    JPanel p = new JPanel();
    x.add(p);

    // Here is where we say random crap to the poor sap who decided to run xorg
    p.add(new JLabel("Hi! I am an instance of WeirdProgram, here to save the day!"));
    p.add(new JLabel("Don't you have anything better to do with your life?"));

    // These weird buttons do weird stuff.
    JButton yes = new JButton("Yes");
    yes.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Tell them some popup and printout messages when they click.
        JOptionPane.showMessageDialog(x, "Go away and do it, please!");
        System.out.println("Lessee wat my perl friend has to say about this :D");
        // Run our perl pal.
        // This block mostly copied from http://www.rgagnon.com/javadetails/java-0014.html
        try {
          String line;
          Process p = Runtime.getRuntime().exec("perl perlthing.pl");
          BufferedReader bri = new BufferedReader
            (new InputStreamReader(p.getInputStream()));
          BufferedReader bre = new BufferedReader
            (new InputStreamReader(p.getErrorStream()));
          while ((line = bri.readLine()) != null) {
            System.out.println(line);
          }
          bri.close();
          while ((line = bre.readLine()) != null) {
            System.out.println(line);
          }
          bre.close();
          p.waitFor();
          System.out.println("Done.");
        }
        catch (Exception err) {
          err.printStackTrace();
        }
        // Kill WeirdProgram. finally. i told you it was dangerous
        System.exit(0);
      }
    });
    JButton no = new JButton("No");
    // ok when it's clicked, say some info just like yes and then die
    no.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(x, "Secretly, Eggs are actually supposed to be green. Childhood: RUINED.");
        System.out.println("A childhood has been ruined today.");
        System.exit(0);
      }
    });

    // ok but the buttons need to be seen to be clicked please
    p.add(yes);
    p.add(no);

    // squeeze everything in there nice and snug and make it show up.
    x.pack();
    x.setVisible(true);
  }
}
