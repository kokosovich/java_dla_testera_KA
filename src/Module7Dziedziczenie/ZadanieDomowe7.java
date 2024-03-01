package Module7Dziedziczenie;

import Model.computer.PC;

public class ZadanieDomowe7 {

    public static void main(String[] args) {

        // w klasie Computer dodać pole które sprawdzi czy jest podłączony do prądu
        // przy włączaniu komputer dodać walidację czy jest podłączony do prądu

        PC officePC = new PC("Office computer", "HP", 500, 128);

        officePC.switchOn();
        System.out.println(officePC.getState());

        officePC.setPowerSupply(true);
        officePC.switchOn();
        System.out.println(officePC.getState());

    }

}
