package C20401442;

import processing.core.*;

public class test5 {
    
    JohnMain cv;
    float angle = 0;
    float h;
    float w;
    public test5(JohnMain cv)
    {
        this.cv = cv;
        h = this.cv.height;
        w = this.cv.width;
    }

    public void render()
    {
        float sides = 50 + (cv.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        cv.background(0);
        cv.translate(w/2, h/2, 0);
        cv.stroke(PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255),255, 255);
        cv.rotateX(angle*3);
        cv.rotateZ(angle*3);
        //cv.rotateX(angle);
        cv.rotateY(angle*3);
        cv.noFill();

        cv.beginShape();
        cv.vertex(-sides, -sides, -sides);
        cv.vertex( sides, -sides, -sides);
        cv.vertex(   0,    0,  sides);

        cv.vertex( sides, -sides, -sides);
        cv.vertex( sides,  sides, -sides);
        cv.vertex(   0,    0,  sides);

        cv.vertex( sides, sides, -sides);
        cv.vertex(-sides, sides, -sides);
        cv.vertex(   0,   0,  sides);

        cv.vertex(-sides,  sides, -sides);
        cv.vertex(-sides, -sides, -sides);
        cv.vertex(   0,    0,  sides);
        cv.endShape();
        angle += 0.01f;
    }
}
