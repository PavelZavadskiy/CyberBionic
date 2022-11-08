public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Player -> play");
    }

    @Override
    public void record() {
        System.out.println("Player -> record");
    }

    @Override
    public void pause() {
        System.out.println("Player -> pause");
    }

    @Override
    public void stop() {
        System.out.println("Player -> stop");
    }
}
