import javax.swing.*;
import java.awt.*;

public class Output extends JPanel {
    private JTextArea textArea;
    public Output(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    public void appendText(String text){
        textArea.append(text);
    }
}
