package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;

public class shearing2DyAxis extends Applet{
	public void paint(Graphics g)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the vertices of rectangle:");
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
		System.out.print("X4: ");
		int x4 = input.nextInt();
		System.out.print("Y4: ");
		int y4 = input.nextInt();

		System.out.println("Enter the shearing factor:");
		System.out.print("Shy: ");
		double shy = input.nextDouble();
		input.close();
		
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x4, y4);
		g.drawLine(x4, y4, x1, y1);
		
		double ysh1 = y1 + shy*x1; //ysh = y + shy*x
		double ysh2 = y2 + shy*x2;
		double ysh3 = y3 + shy*x3;
		double ysh4 = y4 + shy*x4;
		
		g.setColor(Color.green);
		g.drawLine(x1, (int)ysh1, x2, (int)ysh2);
		g.drawLine(x2, (int)ysh2, x3, (int)ysh3);
		g.drawLine(x3, (int)ysh3, x4, (int)ysh4);
		g.drawLine(x4, (int)ysh4, x1, (int)ysh1);
		}
}