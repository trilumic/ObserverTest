import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by emictr on 08.07.2014.
 */
public class ObservableTest extends Observable {

    private String message;
    private GUI gui;

    public ObservableTest(GUI gui){
        this.gui = gui;
        this.addObserver(gui);
        this.addObserver(new GUI());

     message = JOptionPane.showInputDialog("Enter text: ");
        tell(message);
    }

    public void tell(String message){
        setChanged();
        notifyObservers(message);

    }
}