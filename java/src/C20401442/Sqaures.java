package C20401442;

import processing.core.PApplet;

public class Sqaures {
    JohnMain jm;
    float smoothedBoxSize = 0;
    float h;
    float w;
    public Sqaures(JohnMain jm)
    {
        this.jm = jm;
        h = this.jm.height;
        w = this.jm.width;
    }

    public void render()
    {
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        float boxSize = 50+ (100 * jm.getSmoothedAmplitude());

        //center rectangle and draw multiple rectangles
        jm.rectMode(PApplet.CENTER);
        for(int i = 1; i < 13;i++)
        {
            jm.rect(w/2, h/2, boxSize*i, boxSize*i); 
        }
    }
}
