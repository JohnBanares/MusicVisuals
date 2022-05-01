package C20401442;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    JohnMain cv;
    //temp tm;
    //float cy = 0;

    public WaveForm(JohnMain cv)
    {
        this.cv = cv;
        //cy = this.cv.height / 2;
    }
    /*
    public WaveForm(temp tm)
    {
        this.tm = tm;
        cy = this.tm.height / 2;
    }*/

    public void render()
    {
        cv.colorMode(PApplet.HSB);
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
        
        //side waveforms
        for(int i = 0 ; i < cv.height ; i ++)
        {
            cv.stroke(
                PApplet.map(i, 0, cv.height, 0, 255)
                , 255
                , 255
            );

            cv.line(0, i,100 * cv.getAudioBuffer().get(i), i);
            cv.line(cv.width, i,cv.width-100 * cv.getAudioBuffer().get(i), i);
            cv.line(i, 0,i, 100 * cv.getAudioBuffer().get(i));
        }

        //top and bottom waveforms
        for(int i = 0 ; i < cv.width ; i ++)
        {
            cv.stroke(
                PApplet.map(i, 0, cv.height, 0, 255)
                , 255
                , 255
            );

            cv.line(i, 0,i, 100 * cv.getAudioBuffer().get(i));
            cv.line(i, cv.height,i,cv.height- 100 * cv.getAudioBuffer().get(i));
        }

    }
}