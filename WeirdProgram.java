import javax.swing.*;
class WeirdProgram {
  public static void main(String[] args) {
    System.out.println("Oh hey, I'm that weird program everybody is talking about, and I'm starting a GUI.");

    JFrame x = new JFrame("O Hai");
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    x.add(p);

    p.add(new JLabel("Hi! I am an instance of WeirdProgram, here to save the day!"));

    x.pack();
    x.setVisible(true);
  }
}
