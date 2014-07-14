import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by emictr on 08.07.2014.
 */
public class GUI extends JFrame implements Observer {

    private JTextField textField;

    public  GUI(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
        textField = new JTextField();
        this.add(textField);

        this.pack();

    }
    @Override
    public void update(Observable o, Object arg) {
        textField.setText((String) arg + " sent by " + o);
    }
}
