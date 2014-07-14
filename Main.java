/**
 * Created by emictr on 08.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();
        ObservableTest input = new ObservableTest(gui);
        input.addObserver(gui);
    }
}
