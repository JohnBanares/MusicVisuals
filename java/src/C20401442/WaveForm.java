package C20401442;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    JohnMain jm;
    
    public WaveForm(JohnMain jm)
    {
        this.jm = jm;
    }

    public void render()
    {
        jm.colorMode(PApplet.HSB);
        
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

        //top and bottom waveforms
        for(int i = 0 ; i < jm.width ; i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, jm.height, 0, 255)
                , 255
                , 255
            );

            jm.line(i, 0,i, 100 * jm.getAudioBuffer().get(i));
            jm.line(i, jm.height,i,jm.height- 100 * jm.getAudioBuffer().get(i));
        }

    }
}