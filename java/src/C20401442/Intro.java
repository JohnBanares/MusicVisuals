package C20401442;

import processing.core.PApplet;

public class Intro {
    JohnMain jm;
    float h;
    float w;
    public Intro(JohnMain jm)
    {
        this.jm = jm;
        h = this.jm.height;
        w = this.jm.width;
    }

    public void render()
    {
        //title
        jm.textAlign(PApplet.CENTER);
        jm.fill(160,255,255);
        jm.textSize(50);
        jm.text("OOP_Music_Visuals", (w/2), h*.2f);

        //Space to start music
        jm.fill(200,255,0);
        jm.textSize(40);
        jm.text("Space to start music", (w/2), h*.54f);

        //Cycle through music visuals 1-5
        jm.textSize(40);
        jm.text("Cycle through music visuals 1-5", (w/2), h*.6f);

        //By John Matthew Banares
        jm.fill(160,255,255);
        jm.textSize(30);
        jm.text("By John Matthew Banares", (w/2), h*.8f);

    }
}
