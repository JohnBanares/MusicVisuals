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

        //side waveforms
        for(int i = 0 ; i < jm.height ; i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, jm.height, 0, 255)
                , 255
                , 255
            );

            jm.line(0, i,100 * jm.getAudioBuffer().get(i), i);
            jm.line(jm.width, i,jm.width-100 * jm.getAudioBuffer().get(i), i);
        }

        //center pyramid
        jm.translate(w/2, h/2, 0);
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255),255, 255);
        jm.rotateX(angle*3);
        jm.rotateZ(angle*3);
        //cv.rotateX(angle);
        jm.rotateY(angle*3);
        jm.noFill();

        //draw multiple pyramids
        for(int i = 1;i < 5; i++ )
        {
            jm.stroke(50*i, 255, 255);
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
