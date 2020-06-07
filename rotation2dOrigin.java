package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;
import java.math.*;

public class rotation2dOrigin extends Applet{
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

		System.out.println("Enter the angle of rotation in degrees:");
		System.out.print("Angle a: ");
		double a = input.nextDouble();
		input.close();
		
		a = a * Math.PI/180;
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
		double xrt1 = x1*Math.cos(a) - y1*Math.sin(a);
		double yrt1 = x1*Math.sin(a) + y1*Math.cos(a);
		double xrt2 = x2*Math.cos(a) - y2*Math.sin(a);
		double yrt2 = x2*Math.sin(a) + y2*Math.cos(a);
		double xrt3 = x3*Math.cos(a) - y3*Math.sin(a);
		double yrt3 = x3*Math.sin(a) + y3*Math.cos(a);
		
		g.setColor(Color.green);
		g.drawLine((int)xrt1,(int)yrt1, (int)xrt2, (int)yrt2);
		g.drawLine((int)xrt2, (int)yrt2, (int)xrt3, (int)yrt3);
		g.drawLine((int)xrt3, (int)yrt3, (int)xrt1, (int)yrt1);
		}


}
