

package 제어문;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;
public class gameview extends JPanel {
	Image back, horse;
	int x=750;
	int y=500;
	public gameview() {
		back=Toolkit.getDefaultToolkit().getImage("")
		horse=Toolkit.getDefaultToolkit().getImage("")		
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, x, y, x, y, x, y, getFocusCycleRootAncestor())
	}

}
