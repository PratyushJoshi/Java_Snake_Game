import javax.swing.JFrame;
public class GameFrame extends JFrame {
    GameFrame() {
        //this adds new panel
        this.add(new GamePanel());
        //title of the panel
        this.setTitle("Snake");
        //frame will exit the application on closing
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        /*if we add components to a JFrame this pack function
        will fit all the components that we add to JFrame
         */
        this.pack();
        this.setVisible(true);
        /*This window will appear in the middle of
         our computer screen through this method*/
        this.setLocationRelativeTo(null);

    }
}
