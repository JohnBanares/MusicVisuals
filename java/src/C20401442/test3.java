package C20401442;

import processing.core.*;

public class test3 {
    
    JohnMain cv;
    float angle = 0;
    float smoothedBoxSize = 0;
    float h;
    float w;
    public test3(JohnMain cv)
    {
        this.cv = cv;
        h = this.cv.height;
        w = this.cv.width;
    }

    public void render()
    {
        cv.calculateAverageAmplitude();
        cv.background(0);
        cv.noFill();
        cv.lights();
        cv.stroke(PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        cv.translate(w/2, h/2, -200);

        float boxSize = 50 + (cv.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = PApplet.lerp(smoothedBoxSize + 50, boxSize, 0.1f);  
        
        cv.rotateY(angle*2);
        cv.rotateX(angle*2);
        //strokeWeight(1);
        cv.sphere(smoothedBoxSize/ 2);            
        cv.strokeWeight(5);
        
        //cv.box(smoothedBoxSize);
        cv.ellipseMode(PApplet.CENTER);
        for(int i = 1; i <= 4; i ++)
        {
            cv.ellipse(0, 0, boxSize*(i*5), boxSize*(i*5));
        }
        angle += 0.01f;
    }
}
