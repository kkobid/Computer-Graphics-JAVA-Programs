package computerGraphicsJava;

import java.applet.*;
import java.util.*;
import java.awt.*;
public class bresenLine extends Applet
{
	public void paint(Graphics g)
	{
		int x,y,k;
		int dx,dy,p=0,xinc,yinc;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
		int x1 = input.nextInt();
		System.out.print("Enter the value of y1: ");
		int y1 = input.nextInt();
		System.out.print("Enter the value of x2: ");
		int x2 = input.nextInt();
		System.out.print("Enter the value of y2: ");
		int y2 = input.nextInt();
		input.close();
		
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		
		if (x1 > x2) { //line goes from right to left
			xinc = -1; //value of x decreases by 1
		}
		else {
			xinc = 1; // value of x increaes by 1
		}
		if(y1>y2){ // line goes from top to bottom
			yinc = -1; // value of y decreases by 1
		}
		else {
			yinc = 1; // value of y increaese by 1
		}
		x = x1;
		y = y1;
		System.out.println("p \t x \t y");
		System.out.println("---\t---\t---");
		System.out.println(p + "\t" +x + "\t" + y);
		//for |slope| < 1  			// slope = (y2-y1)/(x2-x1) = dy / dx
		if (dy<dx) {
			g.fillOval(x,y,5,5);
			p = 2*dy - dx;
			for(k=0;k<dx;k++)
			{
				x = x + xinc;
				if(p<0)
				{
					p = p + (2*dy);
					}
				else
				{
					y = y + yinc;
					p = p + ((2*dy)-(2*dx));
					}
				System.out.println(p + "\t" +x + "\t" + y);
				g.fillOval(x, y, 5, 5);
				}
		}
		//for |slope| >= 1 
		else {
			g.fillOval(x,y,5,5);
			p = 2*dx-dy;
			for(k=0;k<dy;k++)
			{
				y = y+yinc;
				if(p<0)
				{
					p = p + (2*dx);
					}
				else
				{
					x = x + xinc;
					p = p + ((2*dx)-(2*dy));
					}
				System.out.println(p + "\t" +x + "\t" + y);
				g.fillOval(x, y, 5, 5);
				}
			}
		}
	}
//<applet code="bresenLine.class" width="800" height="800">
//</applet>