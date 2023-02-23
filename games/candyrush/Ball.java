import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Ball extends JLabel implements Runnable
{
	private Thread t;
	private CandyRush cr;
	private Random rand;
	private static int diff=10;
	public Ball(CandyRush cr){
		this.cr=cr;
		
		t = new Thread(this);
		rand = new Random();
		setIcon(new ImageIcon("images\\"+rand.nextInt(10)+".png"));
		t.start();
	}

	public void run(){
		int x=rand.nextInt(cr.getBounds().width-150)+50;
		int y=35;
		int boulX,boulY;
		boolean f=true;
		try{
			while(cr.life>0 && getY()<=cr.getBounds().height-20){
				setBounds(x,y,48,48);
				boulX=cr.boul.getX();
				boulY=cr.boul.getY();
				if(y+24>=boulY && y+24<=boulY+10 && x>boulX && boulX+200>x+48){
					cr.score++;
					cr.labelScore.setText(cr.score+"");
					f=false;
					break;
				}
				Thread.sleep(100);
				y+=diff;
			}
			if(f){
				cr.life--;
				cr.remove(cr.labelLife[cr.life]);
			}
			cr.remove(this);
			cr.validate();
			cr.repaint();
		}catch(Exception ex){}
	}
}