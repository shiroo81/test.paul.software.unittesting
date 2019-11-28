package software.paultest.unittesting;

public class DeviceSupport {

    public void playShortOnAndroid() {
        new Match().playShortGame();
    }
    public void playLongOnAndroid() {
        new Match().playLongGame();
    }

    public void playShortOniOS() {
        new Match().playShortGame();
    }
    public void playLongOniOS() {
        new Match().playLongGame();
    }

}
