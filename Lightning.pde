int x1=0;
int y1=0;
int x2=0;
int y2=0;
float hit = 0;
float lightnings = 0;
void setup()
{
	size(500,500);
	background(0);
}
void draw()
{
	background(0);
	for (int x=0;x<20;x++)
	{
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

void mousePressed()
{
	
	hit=0;
	lightnings=0;
	redraw();
}

