package computerGraphicsJava;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class DDAline extends Applet{	
	public void paint(Graphics g) 
	{
		double dx,dy,steps,x,y,k;
		double xc,yc;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
		double x1 = input.nextDouble();
		System.out.print("Enter the value of y1: ");
		double y1 = input.nextDouble();
		System.out.print("Enter the value of x2: ");
		double x2 = input.nextDouble();
		System.out.print("Enter the value of y2: ");
		double y2 = input.nextDouble();
		input.close();
		dx = x2 - x1;
		dy = y2 - y1;
		if(Math.abs(dx)>Math.abs(dy))
			steps=Math.abs(dx);
		else
			steps=Math.abs(dy);
		xc=(dx/steps);
		yc=(dy/steps);
		x=x1;
		y=y1;
		System.out.println("x \t y");
		System.out.println(x +"\t"+ y);
		g.fillOval((int)x,(int)y,5,5);
		for(k=1;k<=steps;k++)
		{
			x=x+xc;
			y=y+yc;
			System.out.println((int)x+ "\t"+ (int)y);
			g.fillOval((int)x,(int)y,5,5);
			}
		}
	}
/*<applet code="DDAline.class" width="800" height="800">
</applet>*/