package C20401442;

import processing.core.*;

public class CubeVisual1 
{
   
    JohnMain jm;
    float angle = 0;
    //float smoothedBoxSize = 0;

    public CubeVisual1(JohnMain jm)
    {
        this.jm = jm;
    }
    
    public void render()
    {
        //cv.background(0);
        jm.calculateAverageAmplitude();
        jm.stroke(PApplet.map(jm.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jm.strokeWeight(5);
        jm.noFill();
        jm.lights();

        //middle cube
        jm.pushMatrix();
        jm.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        jm.translate(0, 0, -200);
        jm.rotateX(angle);
        jm.rotateZ(angle);       
        float boxSize = 50 + (200 * jm.getSmoothedAmplitude()); 
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        jm.translate(0, 0, -200);
        jm.rotateX(angle+90f);
        jm.rotateZ(angle+90f);       
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        jm.translate(0, 0, -200);
        jm.rotateX(angle+45f);
        jm.rotateZ(angle+45f);       
        jm.box(boxSize);   
        jm.popMatrix();

        angle += 0.01f;

        //top left cube
        jm.pushMatrix();
        jm.translate(150, 0, -200);
        jm.rotateX(angle+90f);
        jm.rotateZ(angle+90f);       
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.translate(150, 0, -200);
        jm.rotateX(angle);
        jm.rotateZ(angle);       
        jm.box(boxSize);   
        jm.popMatrix();

        //top right cube
        jm.pushMatrix();
        jm.translate(850, 0, -200);
        jm.rotateX(angle);
        jm.rotateZ(angle);       
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.translate(850, 0, -200);
        jm.rotateX(angle+90f);
        jm.rotateZ(angle+90f);       
        jm.box(boxSize);   
        jm.popMatrix();

        //bottom left cube
        jm.pushMatrix();
        jm.translate(150, 600, -200);
        jm.rotateX(angle+90f);
        jm.rotateZ(angle+90f);       
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.translate(150, 600, -200);
        jm.rotateX(angle);
        jm.rotateZ(angle);       
        jm.box(boxSize);   
        jm.popMatrix();

        //bottom right cube
        jm.pushMatrix();
        jm.translate(850, 600, -200);
        jm.rotateX(angle);
        jm.rotateZ(angle);       
        jm.box(boxSize);   
        jm.popMatrix();

        jm.pushMatrix();
        jm.translate(850, 600, -200);
        jm.rotateX(angle+90f);
        jm.rotateZ(angle+90f);       
        jm.box(boxSize);   
        jm.popMatrix();

    }


}