package basicsTests;

public class MethodPractice {
    boolean ligada = false;
    int channel = 1;
    int volume = 50;

    public void turnOn(){
        ligada = true;
    }

    public void turnOff(){
        ligada = false;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
}
