package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;

public class reflection2DxAxis extends Applet{
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
		input.close();
		
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
		
		int yrf1 = -y1;
		int yrf2 = -y2;
		int yrf3 = -y3;
		
		g.setColor(Color.green);
		g.drawLine(x1, yrf1, x2, yrf2);
		g.drawLine(x2, yrf2, x3, yrf3);
		g.drawLine(x3, yrf3, x1, yrf1);
	}
}
