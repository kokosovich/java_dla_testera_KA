package Module6PolaIMetodyStatyczne;

import Utils.StringUtils;
import Utils.WeekUtils;

public class PraktyczneStatyczneMetody {

    public static void main(String[] args) {

        String bartekTest = StringUtils.getFormattedText("BartekTest");
        System.out.println(bartekTest);

        String bartek = StringUtils.getFormattedText("Bartek");
        System.out.println(bartek);

        // przykład wbudowanej metody statycznej
        // Math.max(5, 8);

        System.out.println(WeekUtils.MONDAY);

        // przykładowe pole finalne
        // Math.PI;

    }
}
