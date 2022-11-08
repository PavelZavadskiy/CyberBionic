/*
Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() / void pause() /
void stop() и void record() / void pause() / void stop() соответственно. Создайте производный класс Player от базовых
интерфейсов Playable и Recodable. Написать программу, которая выполняет проигрывание и запись.
 */
public class Main {
    public static void main(String[] args) {
        Playable playable = new Player();
        System.out.println("-> Playable");
        playable.play();
        playable.pause();
        playable.stop();
        Recodable recordable = new Player();
        System.out.println("-> Recodable");
        recordable.record();
        recordable.pause();
        recordable.stop();
        Player player = new Player();
        System.out.println("-> Player");
        player.play();
        player.record();
        player.pause();
        player.stop();
    }
}