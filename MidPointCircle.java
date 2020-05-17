package computerGraphicsJava;

/*
<applet code ="MidPointCircle" width=800 height=800>
</applet>
*/

import java.util.*;
import java.applet.*;
import java.awt.*;

public class MidPointCircle extends Applet
{
	public void paint(Graphics g)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the center coordinates and radius:");
		System.out.print("Xc: ");
		int xc = input.nextInt();
		System.out.print("Yc: ");
		int yc = input.nextInt();
		System.out.print("Radius(r): ");
		int r = input.nextInt();
		input.close();
		
		int x = 0;
		int y = r;
		int p = 1 - r; //initial decision parameter p= 5/4 -r ~ 1-r
		System.out.println("p \t x \t y\tx+xc \ty+yc");
		System.out.println("---\t---\t---\t----\t----");
		
		while(x<=y){
			System.out.println(p + "\t" + x + "\t" + y + "\t" + (x+xc) + "\t" + (y+yc));
			//Draw the point (x, y) and its symmetric points
			g.setColor(Color.red);
			g.fillOval(x + xc, y + yc, 2, 2); //x,y
			g.setColor(Color.blue);
			g.fillOval(y + xc, x + yc, 2, 2); // y,x
			g.setColor(Color.cyan);
			g.fillOval(-y + xc, x + yc, 2, 2); //-y,x
			g.setColor(Color.orange);
			g.fillOval(-x + xc, y + yc, 2, 2); // -x,y
			g.setColor(Color.green);
			g.fillOval(-x + xc, -y + yc, 2, 2); // -x,-y
			g.setColor(Color.magenta);
			g.fillOval(-y + xc, -x + yc, 2, 2);// -y,-x
			g.setColor(Color.pink);
			g.fillOval(y + xc, -x + yc, 2, 2);// y,-x
			g.setColor(Color.yellow);
			g.fillOval(x + xc, -y + yc, 2, 2);// x,-y
			if(p<0)
			{
				p = p + 2*x + 1;
				}
			else
			{
				p = p + 2*x - 2*y + 1;                         
				y = y-1;              
				}
			x = x + 1;
			}
		}
	}