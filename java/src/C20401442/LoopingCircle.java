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

    //ipdate i
    void update()
    {
        //higher the value of speed the faster z is out of the screen and respawing more ellipses
        z = z-speed;
        //reset the value of z to the width if z goes off screen (when it is 0) and respawn ellipse by giving new x and y values
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

        //x and y values for ellipses
        float x1 = PApplet.map(x / z, 0, 1 , 0, w/2);
        float y1 = PApplet.map(y / z, 0, 1 , 0, h/2);   
        
        //adjust size of each ellipse
        float size = PApplet.map(z, 0, w/2, 25, 0);

        jm.ellipse(x1, y1, size, size);

    }
}
