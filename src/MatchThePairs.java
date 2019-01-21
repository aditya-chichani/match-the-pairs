import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MatchThePairs extends JFrame implements ActionListener {
	JLabel picLabel;
    private JFrame window = new JFrame("Match the Pairs");
    private JButton exitBtn,ruleBtn,easyBtn,mediumBtn,diffBtn;
    private JButton[] gameBtn = new JButton[25];
    private static int Hit=0, Miss = 13;
    private static JLabel HitScore, MissScore;
    private JPanel P1 = new JPanel();
    private JPanel P2 = new JPanel();
    private JPanel P3 = new JPanel();
    public Container con;
    
    public static void updateHitMiss() {
        HitScore.setText("Hit: " + Hit);
        MissScore.setText("Moves: " + Miss);
    }
    
    public MatchThePairs()
    {
        createGUI();
        createJPanels();
        window.setTitle("Match the Pairs- EASY");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
    }

    public void createGUI()
    {
        for (int i = 0; i < gameBtn.length; i++)
        {
            gameBtn[i] = new JButton();
            gameBtn[i].addActionListener(this);
        }
        HitScore = new JLabel("Hits: " + Hit);
        MissScore = new JLabel("Moves: " + Miss);
        HitScore.setFont(new Font("High tower text", Font.ITALIC,40));
        MissScore.setFont(new Font("High tower text", Font.ITALIC,40));
        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			 System.exit(0);	
			}
		});
        exitBtn.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        exitBtn.addMouseListener(new MouseListener() {
        	
        	@Override
        	public void mouseReleased(MouseEvent e) {
        	
        	}
        	
        	@Override
        	public void mousePressed(MouseEvent e) {
        		
        	}
        	
        	@Override
        	public void mouseExited(MouseEvent e) {
        		exitBtn.setBackground(Color.decode("#85E6FF"));
        	}
        	
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		exitBtn.setBackground(Color.white);	
        	}
        	
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		
        	}
        });
        easyBtn = new JButton("Easy");
        
        easyBtn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				easyBtn.setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				easyBtn.setBackground(Color.decode("#85E6FF"));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
        });
       
        mediumBtn = new JButton("Medium");
        mediumBtn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				mediumBtn.setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {		
				mediumBtn.setBackground(Color.decode("#85E6FF"));
			}

			@Override
			public void mousePressed(MouseEvent e) {
		
			}

			@Override
			public void mouseReleased(MouseEvent e) {
	
			}
        	
        });
        mediumBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.setVisible(false);
				new Medium();				
			}
		});
       
        diffBtn = new JButton("Difficult");
        diffBtn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
	
			}

			@Override
			public void mouseEntered(MouseEvent e) {		
				diffBtn.setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				diffBtn.setBackground(Color.decode("#85E6FF"));
			}

			@Override
			public void mousePressed(MouseEvent e) {
		
			}

			@Override
			public void mouseReleased(MouseEvent e) {
	
			}
        	
        });
        diffBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.setVisible(false);
				new Difficult();								
			}
		});
       
       ruleBtn=new JButton("Rules");
       ruleBtn.addMouseListener(new MouseListener(){

		@Override
		public void mouseClicked(MouseEvent e) {
	
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			ruleBtn.setBackground(Color.white);
		}

		@Override
		public void mouseExited(MouseEvent e) {		
			ruleBtn.setBackground(Color.decode("#85E6FF"));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
		}
    	   
       });
        ruleBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				window.setVisible(false);
				new Rules();
			}
		});
        
        easyBtn.setFont(new Font("High tower text", Font.ITALIC,40));
        mediumBtn.setFont(new Font("High tower text", Font.ITALIC,40));
        diffBtn.setFont(new Font("High tower text", Font.ITALIC,40));
        ruleBtn.setFont(new Font("High tower text", Font.ITALIC,40));
        exitBtn.setFont(new Font("High tower text", Font.ITALIC,40));
        easyBtn.setBackground(Color.decode("#85E6FF"));
        mediumBtn.setBackground(Color.decode("#85E6FF"));
        diffBtn.setBackground(Color.decode("#85E6FF"));
        ruleBtn.setBackground(Color.decode("#85E6FF"));
        exitBtn.setBackground(Color.decode("#85E6FF"));
        easyBtn.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.BLACK));
        mediumBtn.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.black));
        diffBtn.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.black));
        ruleBtn.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.black));
        exitBtn.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.black));
    }

    public void createJPanels()
    {
        Board b=new Board();
        P3=b.getjp();
        con=getContentPane();
        GridLayout g1=new GridLayout(2,1);
        P1.setLayout(g1);
        P1.add(HitScore);
        P1.add(MissScore);
        GridLayout g2=new GridLayout(5,1);
        P2.setLayout(g2);
        P2.add(easyBtn);
        P2.add(mediumBtn);
        P2.add(diffBtn);
        P2.add(ruleBtn);
        P2.add(exitBtn);
        P1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20,20));
        P2.setBorder(BorderFactory.createEmptyBorder(20,20, 20, 20));
        P3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        P1.setBackground(Color.decode("#85E6FF"));
        P2.setBackground(Color.decode("#85E6FF"));
        P3.setBackground(Color.black);
        con.add(P3, BorderLayout.CENTER);
        con.add(P1, BorderLayout.WEST);
        con.add(P2, BorderLayout.EAST);
        window.add(con);  
    }
    
    static public int getHit(){
    	return Hit;
    }
    static public int getMiss(){
    	return Miss;
    }
    public static void setHit(int h){
    	 Hit=h;
    }
    public static void setMiss(int m){
   	    Miss=m;
    }

    
    public static void main(String[] args)
    {
        new MatchThePairs();
    }
    
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}
}
   	
class Board extends JPanel{
    JLabel picLabel;
    private List<Card> cards;
    private Card selectedCard;
    private Card c1;
    private Card c2;
    private Timer t;
    JPanel p;
    public JPanel getjp(){
    	return p;
    }
    
    public Board(){
        int pairs = 8;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();
        String[] s=new String[10];
        for (int i = 0; i < pairs; i++){
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);

        for (int val : cardVals){
            final Card c = new Card();
             c.setId(val);
        		c.setFont(new Font("High tower text", Font.ITALIC, 75));
        		c.setForeground(Color.white);
        		c.setBackground(Color.decode("#000066"));
             c.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.white));
             c.getBounds();
              c.addMouseListener(new MouseListener() {

            	public void mouseEntered(MouseEvent e){
            		c.setBackground(Color.decode("#4775FF"));
            	}

				
				public void mouseClicked(MouseEvent arg0) {
				
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					c.setBackground(Color.decode("#000066"));					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
				
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
				
				}
			});
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    selectedCard = c;
                    doTurn();
                }
            });
            cardsList.add(c);
        }
        this.cards = cardsList;
        //set up the timer
        t = new Timer(750, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                checkCards();
            }
        });
        t.setRepeats(false);
    	p=new JPanel();
    	GridLayout l1=new GridLayout(4, 5);
    	p.setLayout(l1);
    	l1.setHgap(5);
    	l1.setVgap(7);
        for (Card c : cards){
            p.add(c);
        }
    }

    public void doTurn(){
        if (c1 == null && c2 == null){
            c1 = selectedCard;
            c1.setText(String.valueOf(c1.getId()));
        }

        if (c1 != null && c1 != selectedCard && c2 == null){
            c2 = selectedCard;
            c2.setText(String.valueOf(c2.getId()));
            t.start();

        }
    }

    public void checkCards(){
        if (c1.getId() == c2.getId()){//match condition
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setMatched(true); //flags the button as having been matched
            c2.setMatched(true);
            int x=MatchThePairs.getHit();
            MatchThePairs.setHit(x+1);
            if (this.isGameWon() && MatchThePairs.getMiss()!=0){
                JOptionPane.showMessageDialog(this, "Yayyyy!! You win! :D");
                System.exit(0);
            }
            else if(MatchThePairs.getMiss()==0){
            	JOptionPane.showMessageDialog(this, "Oh No!! GAME OVER!! :-(");
                System.exit(0);
            }
        }

        else{
           c1.setText(""); //'hides' text
            c2.setText("");
            int x=MatchThePairs.getMiss();
            MatchThePairs.setMiss(x-1);
        }
        MatchThePairs.updateHitMiss();
        if(MatchThePairs.getMiss()==0){
        	JOptionPane.showMessageDialog(this, "Oh No!! GAME OVER!! :-(");
            System.exit(0);
        }
        
        c1 = null; //reset c1 and c2
        c2 = null;
    }

    public boolean isGameWon(){
        for(Card c: this.cards){
            if (c.getMatched() == false){
                return false;
            }
        }
        return true;
    }

}




