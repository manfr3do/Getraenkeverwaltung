import javax.swing.JFrame;
// Frame erbt von JFrame (superclass)
public class Frame extends JFrame {
    Frame() {
        this.setTitle("Getraenkeverwaltung");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.setVisible(true);
    }
}
