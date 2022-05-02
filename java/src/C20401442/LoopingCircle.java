package C20401442;

import processing.core.*;

public class LoopingCircle {
    
    JohnMain jm;
    float x,y,z;
    float h;
    float w;
    float speed=5;
    public LoopingCircle(JohnMain jm)
    {
        this.jm = jm;
        h = this.jm.height;
        w = this.jm.width;

        x = jm.random(-w,w);
        y = jm.random(-h,h);
        z = jm.random(w);
    }

    void update()
    {
        z = z-speed;
        if(z < 1)
        {
            z = w ;
            x = jm.random(-w,w);
            y = jm.random(-h,h);
        }
    }

    public void render()
    {
        jm.noFill();
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);

        float x1 = PApplet.map(x / z, 0, 1 , 0, w/2);
        float y1 = PApplet.map(y / z, 0, 1 , 0, h/2);   
        
        float size = PApplet.map(z, 0, w/2, 16, 0);
        jm.ellipse(x1, y1, size, size);

    }
}
