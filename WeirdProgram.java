import javax.swing.*;
import java.awt.event.*;
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
        System.out.println("Somebody's making some effort in their life.")
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
