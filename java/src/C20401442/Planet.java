package C20401442;

import processing.core.*;

public class Planet {
    
    JohnMain jm;
    float angle = 0;
    float smoothedBoxSize = 0;
    float h;
    float w;
    public Planet(JohnMain jm)
    {
        this.jm = jm;
        h = this.jm.height;
        w = this.jm.width;
    }

    public void render()
    {
        jm.background(0);
        jm.noFill();
        jm.lights();
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);

        //center sphere
        jm.translate(w/2, h/2, -200);

        float boxSize = 50 + (jm.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = PApplet.lerp(smoothedBoxSize + 50, boxSize, 0.1f);  
        
        jm.rotateY(angle*2);
        jm.rotateX(angle*2);
        //strokeWeight(1);
        jm.sphere(smoothedBoxSize/ 4);            
        jm.strokeWeight(5);
        
        
        //center ellipse and change color
        jm.ellipseMode(PApplet.CENTER);
        for(int i = 1; i <= 4; i ++)
        {
            jm.stroke(20*i, 200, 255);
            jm.ellipse(0, 0, boxSize*(i*5), boxSize*(i*5));
        }
        angle += 0.01f;
    }
}
