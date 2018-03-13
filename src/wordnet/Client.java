
package wordnet;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client extends JFrame
{
    private JPanel mainPanel, sendPanel, resultPanel, buttonPanel;
    private JTextField sendBox;
    private DefaultListModel resultListModel;
    private JList resultList;
    private JLabel sendLabel, resultLabel;
    private JButton sendButton;
    
    public Client()
    {
        setTitle("WordNet Colour Application");
        addWindowListener (new WindowAdapter(){
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        
        Container cp = getContentPane();
        getContentPane().setPreferredSize(new Dimension(500, 250));
        cp.setLayout(new BorderLayout());
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        cp.add(mainPanel);
        
        sendPanel = new JPanel();
        sendPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.add(sendPanel, BorderLayout.NORTH);
        
        
        
        
        
        
        
    }
    
    
}
