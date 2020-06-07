package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;

public class shearing2DxAxis extends Applet{
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
		System.out.print("Shx: ");
		double shx = input.nextDouble();
		input.close();
		
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x4, y4);
		g.drawLine(x4, y4, x1, y1);
		
		double xsh1 = x1 + shx*y1;
		double xsh2 = x2 + shx*y2;
		double xsh3 = x3 + shx*y3;
		double xsh4 = x4 + shx*y4;
		
		g.setColor(Color.green);
		g.drawLine((int)xsh1, y1, (int)xsh2, y2);
		g.drawLine((int)xsh2, y2, (int)xsh3, y3);
		g.drawLine((int)xsh3, y3, (int)xsh4, y4);
		g.drawLine((int)xsh4, y4, (int)xsh1, y1);
		}
}
