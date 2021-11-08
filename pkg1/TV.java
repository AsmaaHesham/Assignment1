
 
package question.pkg1;

public class TV 
{
    boolean on = false;
    int channel; 
    int volumeLevel ;
   

    public TV() 
    {

    }

    public void turnOn() 
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

    public void setChannel(int newChannel)
    {
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel ) {
        if ( newVolumeLevel >= 1 &&newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if ( channel > 1) {
            channel--;
        }
    }

    public void volumeUp() 
    {
        if ( volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if ( volumeLevel > 1) {
            volumeLevel--;
        }
    }
}


     
    
