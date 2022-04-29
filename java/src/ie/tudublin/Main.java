package ie.tudublin;

import C20401442.JohnMain;
import example.CubeVisual;
import example.CubeVisual1;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	
	//new change
	/*
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}*/
	
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new JohnMain());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}