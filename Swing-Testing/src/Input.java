import javax.swing.*;
import java.awt.*;

public class Input extends JPanel {
    private JTextArea textArea;
    public Input(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public String getText(){

        return textArea.getText();
    }
}

