package C20401442;

import processing.core.*;

public class test3 {
    
    JohnMain cv;
    float angle = 0;
    float h;
    float w;
    public test3(JohnMain cv)
    {
        this.cv = cv;
        h = this.cv.height;
        w = this.cv.width;
    }
    
    float smoothedBoxSize = 0;


    public void render()
    {
        cv.calculateAverageAmplitude();
        cv.background(0);
        cv.noFill();
        cv.lights();
        cv.stroke(PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        cv.translate(w/2, h/2, -200);

        float boxSize = 50 + (cv.getAmplitude() * 300);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = PApplet.lerp(smoothedBoxSize + 100, boxSize, 0.2f);  

        cv.rotateY(angle);
        cv.rotateX(angle);
        //strokeWeight(1);
        cv.sphere(smoothedBoxSize/ 2);            
        cv.strokeWeight(5);
        
        cv.box(smoothedBoxSize);
        angle += 0.01f;
    }
}
