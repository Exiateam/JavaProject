package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IModel;
import model.Model;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

		
	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	protected void paintComponent(final Graphics graphics) 
	{
		//graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getMap(), 0, 20);
		
		JPanel pan = new JPanel();
		String level = new String(this.getViewFrame().getModel().getMap());
		pan.setBackground(Color.BLACK);
		this.setBackground(Color.BLACK);
		System.out.println(level);
		int i;
		
		for (i = 0; i != 240; i++)
    	{
        	char caracter = (!level.equals("")) ? level.charAt(i) : ' ';
        	switch (caracter)
        	{
            case 'A': 
                Icon laurann = new ImageIcon("/Users/julien/Downloads/sprite/Lorann.gif");
                JLabel l = new JLabel();
                l.setIcon(laurann);
                //l.setBounds(model.lorann.getX(), model.lorann.getY(), 32, 32);
                pan.add(l);
                break;
            case 'B': 
                Icon fireball = new ImageIcon("/Users/julien/Downloads/sprite/fireball.gif");
                JLabel f1 = new JLabel();
                f1.setIcon(fireball); 
                pan.add(f1);
                break;
            case 'C': 
                Icon crystall_ball = new ImageIcon("/Users/julien/Downloads/sprite/crystal_ball.png");
                JLabel c = new JLabel();
                c.setIcon(crystall_ball); 
                pan.add(c);
                break;
            case 'D': 
                Icon gate_closed = new ImageIcon("/Users/julien/Downloads/sprite/gate_closed.png");
                JLabel gc = new JLabel();
                gc.setIcon(gate_closed); 
                pan.add(gc);
                break;
            case 'E': 
                Icon gate_open = new ImageIcon("/Users/julien/Downloads/sprite/gate_open.png");
                JLabel go = new JLabel();
                go.setIcon(gate_open); 
                pan.add(go);
                break;
            case 'F':
                Icon bone = new ImageIcon("/Users/julien/Downloads/sprite/bone.png");
                JLabel bo = new JLabel();
                bo.setIcon(bone); 
                pan.add(bo);
                break;
            case 'G': 
                Icon bone_horizontal = new ImageIcon("/Users/julien/Downloads/sprite/horizontal_bone.png");
                JLabel bh = new JLabel();
                bh.setIcon(bone_horizontal); 
                pan.add(bh); 
                break;
            case 'H': 
                Icon vertical_bone = new ImageIcon("/Users/julien/Downloads/sprite/vertical_bone.png");
                JLabel vb = new JLabel();
                vb.setIcon(vertical_bone); 
                pan.add(vb); 
                break;
            case 'I':          
                Icon monster_1 = new ImageIcon("/Users/julien/Downloads/sprite/monster_1.png");
                JLabel m1 = new JLabel();
                m1.setIcon(monster_1); 
                pan.add(m1); 
                break;
            case 'J':          
                Icon monster_2 = new ImageIcon("/Users/julien/Downloads/sprite/monster_2.png");
                JLabel m2 = new JLabel();
                m2.setIcon(monster_2); 
                pan.add(m2); 
                break;
            case 'K':          
                Icon monster_3 = new ImageIcon("/Users/julien/Downloads/sprite/monster_3.png");
                JLabel m3 = new JLabel();
                m3.setIcon(monster_3); 
                pan.add(m3); 
                break;
            case 'L':          
                Icon monster_4 = new ImageIcon("/Users/julien/Downloads/sprite/monster_4.png");
                JLabel m4 = new JLabel();
                m4.setIcon(monster_4); 
                pan.add(m4); 
                break;
            case 'M': 
                Icon purse = new ImageIcon("/Users/julien/Downloads/sprite/purse.png");
                JLabel p = new JLabel();
                p.setIcon(purse); 
                pan.add(p);
                break;
            case 'N':
                Icon empty = new ImageIcon("/Users/julien/Downloads/sprite/empty.png");
                JLabel empt = new JLabel();
                empt.setIcon(empty); 
                pan.add(empt);
                break;
		        } 
		    }
			//this.validate();
			this.add(pan);
			
	}	
}
