package C20401442;

import processing.core.*;

public class CubeVisual1 
{
   
    JohnMain cv;

    public CubeVisual1(JohnMain cv)
    {
        this.cv = cv;
    }
    float angle = 0;
    float smoothedBoxSize = 0;
    
    public void render()
    {
        //cv.background(0);
        cv.calculateAverageAmplitude();
        cv.stroke(PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        cv.strokeWeight(5);
        cv.noFill();
        cv.lights();

        //middle cube
        cv.pushMatrix();
        cv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        cv.translate(0, 0, -200);
        cv.rotateX(angle);
        cv.rotateZ(angle);       
        float boxSize = 50 + (200 * cv.getSmoothedAmplitude()); 
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        cv.translate(0, 0, -200);
        cv.rotateX(angle+90f);
        cv.rotateZ(angle+90f);       
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        cv.translate(0, 0, -200);
        cv.rotateX(angle+45f);
        cv.rotateZ(angle+45f);       
        cv.box(boxSize);   
        cv.popMatrix();

        angle += 0.01f;

        //top left cube
        cv.pushMatrix();
        cv.translate(150, 0, -200);
        cv.rotateX(angle+90f);
        cv.rotateZ(angle+90f);       
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(150, 0, -200);
        cv.rotateX(angle);
        cv.rotateZ(angle);       
        cv.box(boxSize);   
        cv.popMatrix();

        //top right cube
        cv.pushMatrix();
        cv.translate(850, 0, -200);
        cv.rotateX(angle);
        cv.rotateZ(angle);       
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(850, 0, -200);
        cv.rotateX(angle+90f);
        cv.rotateZ(angle+90f);       
        cv.box(boxSize);   
        cv.popMatrix();

        //bottom left cube
        cv.pushMatrix();
        cv.translate(150, 600, -200);
        cv.rotateX(angle+90f);
        cv.rotateZ(angle+90f);       
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(150, 600, -200);
        cv.rotateX(angle);
        cv.rotateZ(angle);       
        cv.box(boxSize);   
        cv.popMatrix();

        //bottom right cube
        cv.pushMatrix();
        cv.translate(850, 600, -200);
        cv.rotateX(angle);
        cv.rotateZ(angle);       
        cv.box(boxSize);   
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(850, 600, -200);
        cv.rotateX(angle+90f);
        cv.rotateZ(angle+90f);       
        cv.box(boxSize);   
        cv.popMatrix();

    }


}