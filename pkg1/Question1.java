
package question.pkg1;


public class Question1 {

   
    public static void main(String[] args) {
        TV  tv = new TV ();
        tv.turnOn();
        tv.setChannel(33);
        tv.setVolume(6);

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeUp();

        System.out.println(" channel is " + tv.channel + " volume is " + tv.volumeLevel);
        System.out.println(" channel is " + tv1.channel + " volume level"+tv1.volumeLevel);
   
    } 
}
