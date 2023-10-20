import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main class that creates a Java GUI and utilizes the Box class
 *
 * @author Bennett Fife
 * @version 10/18/23
 */

public class Main {
    public static void main(String[] args) {
        //Create the blank GUI frame
        Frame f = new JFrame("Box Calculations");
        f.setSize(500, 200);

        //create, setBounds, and add the buttons to the frame
        JButton calcVolButton = new JButton("Calc Volume");
        JButton calcSAButton = new JButton("Calc Surface Area");
        JButton boxDetailsButton = new JButton("Display Box Details");
        calcVolButton.setBounds(5, 120, 150, 30);
        calcSAButton.setBounds(165, 120, 150, 30);
        boxDetailsButton.setBounds(325, 120, 150, 30);
        f.add(calcVolButton);
        f.add(calcSAButton);
        f.add(boxDetailsButton);

        //create, setBounds, and add the labels to the frame
        JLabel lengthLabel = new JLabel("Length");
        JLabel widthLabel = new JLabel("Width");
        JLabel heightLabel = new JLabel("Height");
        lengthLabel.setBounds(55, 20, 150, 30);
        widthLabel.setBounds(215, 20, 150, 30);
        heightLabel.setBounds(375, 20, 150, 30);
        f.add(lengthLabel);
        f.add(widthLabel);
        f.add(heightLabel);

        //create, setBounds, and add the Text Fields to the frame
        JTextField lengthInput = new JTextField("");
        JTextField widthInput = new JTextField("");
        JTextField heightInput = new JTextField("");
        lengthInput.setBounds(5, 50, 150, 30);
        widthInput.setBounds(165, 50, 150, 30);
        heightInput.setBounds(325, 50, 150, 30);
        f.add(lengthInput);
        f.add(widthInput);
        f.add(heightInput);

        f.setLayout(null);
        //show the window on run
        f.setVisible(true);

        //button action for calculating volume of the input
        calcVolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //convert inputs to Doubles and create Box object
                    Double l = Double.parseDouble(lengthInput.getText());
                    Double w = Double.parseDouble(widthInput.getText());
                    Double h = Double.parseDouble(heightInput.getText());
                    Box tempBox = new Box(l, w, h);
                    //display the calculation in a pop-up
                    JOptionPane.showMessageDialog(f, tempBox.calcVolume());
                    //catch if the input can't be converted to a double (i.e. String characters)
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(f, "One or more of the inputs is not valid.");
                }
            }
        });

        //button action for calculating surface area of the input
        calcSAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //convert inputs to Doubles and create Box object
                    Double l = Double.parseDouble(lengthInput.getText());
                    Double w = Double.parseDouble(widthInput.getText());
                    Double h = Double.parseDouble(heightInput.getText());
                    Box tempBox = new Box(l, w, h);
                    //display the calculation in a pop-up
                    JOptionPane.showMessageDialog(f, "Surface Area: " + tempBox.calcSurfaceArea());
                    //catch if the input can't be converted to a double (i.e. String characters)
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(f, "One or more of the inputs is not valid.");
                }
            }
        });

        //button action for displaying Box object details
        boxDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //convert inputs to Doubles and create Box object
                    Double l = Double.parseDouble(lengthInput.getText());
                    Double w = Double.parseDouble(widthInput.getText());
                    Double h = Double.parseDouble(heightInput.getText());
                    Box tempBox = new Box(l, w, h);
                    //display the Box details in a pop-up
                    JOptionPane.showMessageDialog(f, "Length: " + tempBox.getLength() + ", Width: " + tempBox.getWidth() + ", Height: " + tempBox.getHeight());
                    //catch if the input can't be converted to a double (i.e. String characters)
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(f, "One or more of the inputs is not valid.");
                }
            }
        });
    }
}
