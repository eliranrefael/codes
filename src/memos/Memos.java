package memos;

import java.awt.Color;
import static java.awt.Color.*;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;

/**
 *
 * @author eliran refael
 */
public class Memos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Memo's");
        JPanel mainPanel=new JPanel();
        JPanel buttonsPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel datePanel = new JPanel();
        JPanel memoPanel = new JPanel();
        JButton save = new JButton("save");
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = "" + (i + 1);
        }

        String[] months = new String[12];
        for (int i = 0; i < 12; i++) {
            months[i] = "" +( i + 1);
        }

        String[] years = new String[20];
        for (int i = 0; i < 20; i++) {
            years[i] = "" +( i + 1998);
        }

        JComboBox day = new JComboBox(days);
        JComboBox month = new JComboBox(months);
        JComboBox year = new JComboBox(years);
        datePanel.add(day);
        datePanel.add(month);
        datePanel.add(year);

        JTextArea text=new JTextArea(5,20);
        text.setBorder(new FieldBorder(LIGHT_GRAY,BLACK,DARK_GRAY,DARK_GRAY));
        textPanel.add(text);
        
        buttonsPanel.add(save);
        
        Hashtable<Date, String> memos = new Hashtable<Date, String>();

        
        mainPanel.add(datePanel);
        mainPanel.add(textPanel);
        mainPanel.add(buttonsPanel);
frame.add(mainPanel);

        frame.setSize(500,500);
        frame.setVisible(true);
    }

}
