package C20401442;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    JohnMain jm;
    float cy = 0;

    public WaveForm(JohnMain jm)
    {
        this.jm = jm;
        cy = this.jm.height / 2;
    }

    public void render()
    {
        jm.colorMode(PApplet.HSB);
        for(int i = 0 ; i < jm.getAudioBuffer().size() ; i ++)
        {
            jm.stroke(
                PApplet.map(i, 0, jm.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            jm.line(i, cy, i, cy + cy * jm.getAudioBuffer().get(i));
        }
    }
}