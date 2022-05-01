package C20401442;

import processing.core.PApplet;

public class Sqaures {
    JohnMain cv;
    float angle = 0;
    float smoothedBoxSize = 0;
    float h;
    float w;
    public Sqaures(JohnMain cv)
    {
        this.cv = cv;
        h = this.cv.height;
        w = this.cv.width;
    }

    public void render()
    {
        cv.stroke(PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        float boxSize = 100+ (300 * cv.getSmoothedAmplitude());
        cv.rectMode(PApplet.CENTER);
        for(int i = 1; i < 7;i++)
        {
            //cv.rect(w/2, h/2, boxSize, boxSize);
            cv.rect(w/2, h/2, boxSize*i, boxSize*i);
            
        }
    }
}
