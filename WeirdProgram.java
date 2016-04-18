import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class WeirdProgram {
  public static void main(String[] args) {
    System.out.println("Oh hey, I'm that weird program everybody is talking about, and I'm starting a GUI.");

    JFrame x = new JFrame("O Hai");
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    x.add(p);

    p.add(new JLabel("Hi! I am an instance of WeirdProgram, here to save the day!"));
    p.add(new JLabel("Don't you have anything better to do with your life?"));

    JButton yes = new JButton("Yes");
    yes.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(x, "Go away and do it, please!");
        System.out.println("Lessee wat my perl friend has to say about this :D");
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
        System.exit(0);
      }
    });
    JButton no = new JButton("No");
    no.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(x, "Secretly, Eggs are actually supposed to be green. Childhood: RUINED.");
        System.out.println("A childhood has been ruined today.");
        System.exit(0);
      }
    });
    p.add(yes);
    p.add(no);

    x.pack();
    x.setVisible(true);
  }
}
