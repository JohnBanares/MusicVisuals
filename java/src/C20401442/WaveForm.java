package C20401442;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    JohnMain jm;
    //temp tm;
    float cy = 0;

    public WaveForm(JohnMain jm)
    {
        this.jm = jm;
        cy = this.jm.height / 2;
    }
    /*
    public WaveForm(temp tm)
    {
        this.tm = tm;
        cy = this.tm.height / 2;
    }*/

    public void render()
    {
        jm.colorMode(PApplet.HSB);
        /*
        for(int i = 0 ; i < 50 + (200 * jm.getSmoothedAmplitude());i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, 50 + (200 * jm.getSmoothedAmplitude()), 0, 255)
                , 255
                , 255
            );

            jm.line(450+i, cy, 450+i, cy + cy * jm.getAudioBuffer().get(i));
        }*/
        /*
        for(int i = 0 ; i < jm.getAudioBuffer().size() ; i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, jm.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            jm.line(cy, i,cy- cy * jm.getAudioBuffer().get(i), i);
        }*/
        
        for(int i = 0 ; i < jm.height ; i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, jm.height, 0, 255)
                , 255
                , 255
            );

            jm.line(0, i,100 * jm.getAudioBuffer().get(i), i);
        }
    }
}