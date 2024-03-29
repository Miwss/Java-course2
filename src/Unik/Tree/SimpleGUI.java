package Unik.Tree;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private  JButton button = new JButton("Press");
    private  JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);


    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(200,200,300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    //Пишем всю реализацию тут, все что будет выведено.
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
//            int i = 0;
//            while(i < 10){
//                i++;
////                JOptionPane.showMessageDialog( null,i);
//            }
//            JOptionPane.showMessageDialog( null,i);
            String message = "";

            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";
            message += "Checkbox is " + ((check.isSelected()) ? "Checked" : "unchecked");
            JOptionPane.showMessageDialog(null,message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
    }
}
