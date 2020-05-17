package computerGraphicsJava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.applet.*;

public class translationTri2D extends Applet{
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

		System.out.println("Enter the translation vector:");
		System.out.print("tx: ");
		int tx = input.nextInt();
		System.out.print("ty: ");
		int ty = input.nextInt();
		input.close();
		
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x1, y1, x3, y3);
		g.drawLine(x2, y2, x3, y3);
		int xt1 = x1 + tx;
		int yt1 = y1 + ty;
		int xt2 = x2 + tx;
		int yt2 = y2 + ty;
		int xt3 = x3 + tx;
		int yt3 = y3 + ty;
		
		g.setColor(Color.green);
		g.drawLine(xt1, yt1, xt2, yt2);
		g.drawLine(xt1, yt1, xt3, yt3);
		g.drawLine(xt3, yt3, xt2, yt2);
		}
}
