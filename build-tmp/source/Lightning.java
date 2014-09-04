import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int x1=0;
int y1=0;
int x2=0;
int y2=0;
float hit = 0;
float lightnings = 0;
public void setup()
{
	size(500,500);
	background(0);
}
public void draw()
{
	background(0);
	for (int x=0;x<20;x++)
	{
		//fill(random(255),random(255),random(255));
		//ellipse(250, 250, 250, 250);
		stroke(random(255),random(255),random(255));
		while (x1 < 500)
		{
			x2 = x2+(int)(Math.random()*15)+1;
			y2 = y2+(int)(Math.random()*15)+1;
			line(x1,y1,x2,y2);
			x1 = x2;
			y1 = y2;	
		}
		lightnings++;
		if (x2==500 && y2==500)
		{
			hit++;
		}
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;	
	}
	if (lightnings == 10000)
	{
		println("number of lightnings " + lightnings);
	println("nuber of hits at (500,500) " + hit);
	println("hit percentage " + (hit/lightnings)*100);
		noLoop();
	}
}

public void mousePressed()
{
	
	hit=0;
	lightnings=0;
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
