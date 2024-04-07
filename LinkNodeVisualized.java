import java.awt.*;
import javax.swing.*;


public class LinkNodeVisualized extends JPanel{

    // declares a class which extends a JPanel

    // creates color objects representing the top and bottom colors used for visual representation
    Color topColor = new Color(17, 166, 15);
    Color bottomColor = new Color(140, 8, 39);

    // creates font objects to display the fonts
    Font addressFont = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
    Font contentFont = new Font(Font.MONOSPACED, Font.BOLD, 15);

    // declares a dimension object named size to store the size of the visualized node
    Dimension size;

    // creates an object used for positioning components
    GridBagConstraints gbc = new GridBagConstraints();

    // declares JLabel objects to display previous address, contained content and next address
    JLabel top;
    JLabel content;
    JLabel bottom;

    // declares an integer variable to store the height of each component within the node
    int smallHeight;

    LinkNodeVisualized(int width, int height, String previousAddress, String containedContent, String nextAddress){

        // constructor for the class

        // intializes the size variable with the specific height and width
        size = new Dimension(width, height);

        // sets the minimum and prefferd size of the panel for the specified hieight and width
        setMinimumSize(size);
        setPreferredSize(size);
        setLayout(new GridBagLayout());

        // sets constraints for the gridbag layout
        gbc.insets = new Insets(0,0,0,0);
        gbc.gridx = 1;
        gbc.gridy = 1;

        // calculates the height of each component based on the total height of the panel
        smallHeight = height / 4;

        // creates a JLabel for displaying the previous address and aligns it
        top = new JLabel(previousAddress, SwingConstants.CENTER);

        // set the font, background color and make the label opaque
        top.setMinimumSize(new Dimension(width, smallHeight));
        top.setPreferredSize(new Dimension(width, smallHeight));

        top.setFont(addressFont);
        top.setOpaque(true);
        top.setBackground(topColor);


        content = new JLabel(containedContent, SwingConstants.CENTER);
        content.setMinimumSize(new Dimension(width, smallHeight * 2));
        content.setPreferredSize(new Dimension(width, smallHeight * 2));
        content.setFont(contentFont);
        content.setOpaque(true);

        // creates new JLabel for displaying the previous address
        bottom = new JLabel(nextAddress, SwingConstants.CENTER);
        bottom.setMinimumSize(new Dimension(width, smallHeight));
        bottom.setPreferredSize(new Dimension(width, smallHeight));
        bottom.setFont(addressFont);
        bottom.setOpaque(true);
        bottom.setBackground(bottomColor);

        // each label is added to a different row in the grid layout
        add(top, gbc);
        gbc.gridy = 2;
        add(content, gbc);
        gbc.gridy = 3;
        add(bottom, gbc);

    }
}