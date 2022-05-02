package C20401442;

import ie.tudublin.*;

public class JohnMain extends Visual
{
    int mode;
    WaveForm wf;
    CubeVisual1 cv;
    test3 tm;
    Sqaures sq;
    test5 tc;
    LoopingCircle[] loop_star = new LoopingCircle[100];
    //AudioBandsVisual abv;

    public void settings()
    {
        size(1024, 700, P3D);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D,SPAN); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("00. Feel.mp3");   

        
        // Call this instead to read audio from the microphone
        //startListening(); 
        
        wf = new WaveForm(this);
        cv = new CubeVisual1(this);
        tm = new test3(this);
        sq = new Sqaures(this);
        tc = new test5(this);

        for(int i = 0; i< loop_star.length;i++)
        {
            loop_star[i] = new LoopingCircle(this);
        }

    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
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
                wf.render();
                cv.render();
                break;
            }
            case 2:
            {
                sq.render();
                break;
            }
            case 3:
            {
                tm.render();
                break;
            }
            case 4:
            {
                tc.render();
                break;
            }
            case 5:
            {
                translate(width/2, height/2);
                for(int i = 0; i< loop_star.length;i++)
                {
                    loop_star[i].update();
                    loop_star[i].render();
                }
                break;
            }
        }
    }
}