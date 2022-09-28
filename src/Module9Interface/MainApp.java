package Module9Interface;

import Model.computer.Laptop;

public class MainApp {

    public static void main(String[] args) {
        
        Laptop laptop = new Laptop("HP", "HP", 500, 128, 100);

        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHelloFromMusic();

        laptop.playVideo();
        laptop.pauseVideo();
        laptop.stopVideo();

        laptop.sayHelloFromVideo();
    
        laptop.sayHello();

    }
}