package Module8Abstrakcja;

import Model.computer.Laptop;
import Model.computer.PC;

public class MainApp {
    
    public static void main(String[] args) {
        
        PC officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        PC officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        PC officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Laptop macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);
        
    }
}
