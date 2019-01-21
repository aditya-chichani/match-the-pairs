import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rules extends JFrame implements ActionListener{
	private JFrame w = new JFrame("Match the Pairs Rules");
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
    Rules(){
	  super ("Match the Pairs Rule");
	  String text="<html><body><p align=center color=#003300><b><font size=10 style=Georgia bold>RULES FOR THE GAME</font></b></p><br><br>"
	  		+ "<p color=#990066><font size=5 style=Georgia><i>1:Mix Up the cards.<br>2:Lay them in rows face down.<br>3:Turn over any two cards.<br>4:If"
	  		+ " the two cards match its a <b>HIT</b>.<br>5:If the cards don't match,they get turned back over and you lose a move.<br>"
	  		+ "6:Remember what was on each card and where it was.<br>7:You win when all the cards have been matched.<br><br><u>Watch your Moves </u>"
	  		+ "   ;)</font></i></p></body></html>";
	  Container con =getContentPane();
	  con.setLayout(new GridLayout(2,1));
	  con.setBackground(Color.decode("#CCCFFF"));
	  JLabel l1=new JLabel(text);
      JButton b=new JButton("Let's play!!");
      b.setSize(500, 250);;
      p1.add(l1);
      p2.add(b);
      p1.setBackground(Color.decode("#CCCFFF"));  
      p2.setBackground(Color.decode("#CCCFFF"));  
      b.setFont(new Font("High tower text",Font.ITALIC, 45));
      b.setBackground(Color.decode("#FFCC99"));
      b.setForeground(Color.decode("#FF3300"));
      con.add(p1);
      con.add(p2);
      b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				w.setVisible(false);
				setVisible(false);
				new MatchThePairs();	
			}
		});
    setExtendedState(JFrame.MAXIMIZED_BOTH);	 
    setVisible(true);
}
  @Override
  public void actionPerformed(ActionEvent arg0) {
  
  }
}

