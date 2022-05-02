package C20401442;

import processing.core.*;

public class Pyramid {
    
    JohnMain jm;
    float angle = 0;
    float h;
    float w;
    public Pyramid(JohnMain jm)
    {
        this.jm = jm;
        h = this.jm.height;
        w = this.jm.width;
    }

    public void render()
    {
        float sides = 20 + (jm.getAmplitude() * 100);//map(average, 0, 1, 100, 400); 
        jm.background(0);
        jm.translate(w/2, h/2, 0);
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255),255, 255);
        jm.rotateX(angle*3);
        jm.rotateZ(angle*3);
        //cv.rotateX(angle);
        jm.rotateY(angle*3);
        jm.noFill();

        for(int i = 1;i < 5; i++ )
        {
            jm.stroke(10*i, 160, 255);
            jm.beginShape();
            jm.vertex(-sides*i, -sides*i, -sides*i);
            jm.vertex( sides*i, -sides*i, -sides*i);
            jm.vertex(   0,    0,  sides*i);

            jm.vertex( sides*i, -sides*i, -sides*i);
            jm.vertex( sides*i,  sides*i, -sides*i);
            jm.vertex(   0,    0,  sides*i);

            jm.vertex( sides*i, sides*i, -sides*i);
            jm.vertex(-sides*i, sides*i, -sides*i);
            jm.vertex(   0,   0,  sides*i);

            jm.vertex(-sides*i,  sides*i, -sides*i);
            jm.vertex(-sides*i, -sides*i, -sides*i);
            jm.vertex(   0,    0,  sides*i);
            jm.endShape();
        }
        angle += 0.01f;
    }
}
