public class UserTv {
    public static void main(String[] args) {
        MethodPractice smartTv = new MethodPractice();

        System.out.println("Tv is on? " + smartTv.ligada);
        System.out.println("whats is the channel? " + smartTv.channel);
        System.out.println("what is the volume" + smartTv.volume);

        smartTv.turnOn();
        System.out.println("New Status --> " + smartTv.ligada);

        smartTv.turnOff();
        System.out.println("New Status --> " + smartTv.ligada);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        System.out.println("New volume status--> " + smartTv.volume);

        smartTv.decreaseVolume();
        System.out.println("\nNew volume status--> " + smartTv.volume);

        smartTv.changeChannel(6);
        System.out.println("Changing to channel: " + smartTv.channel);
    }
}
