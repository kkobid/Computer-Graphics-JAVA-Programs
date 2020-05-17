package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;
import java.math.*;

public class scalingOrigin2D extends Applet{
	public void paint(Graphics g)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the vertices of triangle:");
		System.out.print("X1: ");
		int x1 = input.nextInt();
		System.out.print("Y1: ");
		int y1 = input.nextInt();
		System.out.print("X2: ");
		int x2 = input.nextInt();
		System.out.print("Y2: ");
		int y2 = input.nextInt();
		System.out.print("X3: ");
		int x3 = input.nextInt();
		System.out.print("Y3: ");
		int y3 = input.nextInt();

		System.out.println("Enter the Scaling factor:");
		System.out.print("Sx: ");
		double sx = input.nextDouble();
		System.out.print("Sy: ");
		double sy = input.nextDouble();
		input.close();
		
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x1, y1, x3, y3);
		g.drawLine(x2, y2, x3, y3);
		double xs1 = x1*sx;
		double ys1 = y1*sy;
		double xs2 = x2*sx;
		double ys2 = y2*sy;
		double xs3 = x3*sx;
		double ys3 = y3*sy;
		
		g.setColor(Color.green);
		g.drawLine((int)xs1,(int)ys1, (int)xs2, (int)ys2);
		g.drawLine((int)xs1, (int)ys1, (int)xs3, (int)ys3);
		g.drawLine((int)xs3, (int)ys3, (int)xs2, (int)ys2);
		}
}
