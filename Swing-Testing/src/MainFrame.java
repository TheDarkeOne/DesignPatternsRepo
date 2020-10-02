import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Input input;
    private JButton btn1;
    private JButton btn2;
    private Output output;


    public MainFrame(){
        super("Swing Testing");

        setSize(200,333);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        input = new Input();
        btn1 = new JButton("Copy");
        btn2 = new JButton("Copy X2");
        output = new Output();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 0;
        c.ipadx = 100;
        c.gridwidth = 2;
        add(input, c);

        c.gridx=0;
        c.gridy=1;
        c.ipady=0;
        c.ipadx=0;
        c.gridheight=1;
        c.gridwidth = 1;
        add(btn1, c);

        c.gridx=1;
        c.gridy=1;
        add(btn2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 200;
        c.ipadx = 100;
        c.gridwidth = 2;
        add(output, c);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.appendText(input.getText()  + "\n");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.appendText(input.getText() + "\n");
                output.appendText(input.getText() + "\n");
            }
        });

    }
}

