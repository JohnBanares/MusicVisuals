package C20401442;

import ie.tudublin.*;

public class JohnMain extends Visual
{
    int mode;
    WaveForm wf;
    Cubes cv;
    Planet p;
    Sqaures sq;
    Pyramid pr;
    LoopingCircle[] loop_circle = new LoopingCircle[100];
    Intro in;

    public void settings()
    {
        size(1024, 700, P3D); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("00. Feel.mp3");   

        wf = new WaveForm(this);
        cv = new Cubes(this);
        p = new Planet(this);
        sq = new Sqaures(this);
        pr = new Pyramid(this);

        for(int i = 0; i< loop_circle.length;i++)
        {
            loop_circle[i] = new LoopingCircle(this);
        }

        in = new Intro(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().play();
        }

        if (key == 'r')
        {
            getAudioPlayer().cue(0);
        }

        if(key >='0' && key <='5')
        {
            mode = key-'0';
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        switch(mode)
        {
            case 1:
            {
                //waveform and cubes
                wf.render();
                cv.render();
                break;
            }
            case 2:
            {
                //planet
                p.render();
                break;
            }
            case 3:
            {
                //squares
                sq.render();
                break;
            }
            case 4:
            {
                //pyramid
                pr.render();
                break;
            }
            case 5:
            {
                //make circle start from the center of the screen if commented out this is zooming in from the top left hand corner
                translate(width/2, height/2);
                //render and update 100 circles
                for(int i = 0; i< loop_circle.length;i++)
                {
                    loop_circle[i].update();
                    loop_circle[i].render();
                }
                break;
            }
            default:
            {
                in.render();
            }
        }
    }
}