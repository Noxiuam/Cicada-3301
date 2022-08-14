package gq.noxiuam.cicada.translator.feature;

import gq.noxiuam.cicada.translator.Main;
import java.util.Scanner;

public class RuneTranslator {

    /**
     * English to Rune translator.
     */
    public static void translateToRunes() {
        System.out.println("Type a message to translate.");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        for (int i = 0; i < Main.getInstance().getRunes().length; i++) {
            if (message.contains(Main.getInstance().getRuneTranslations().get(i).getTranslation())) {
                message = message.replace(Main.getInstance().getRuneTranslations().get(i).getTranslation(), Main.getInstance().getRuneTranslations().get(i).getRune());
            }
        }

        System.out.println(message);
        translateToRunes();
    }

    /**
     * Rune to English translator.
     */
    public static void translateToEnglish() {
        System.out.println("Type a message to translate.");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        for (int i = 0; i < Main.getInstance().getRunes().length; i++) {
            if (message.contains(Main.getInstance().getRuneTranslations().get(i).getRune())) {
                message = message.replace(Main.getInstance().getRuneTranslations().get(i).getRune(), Main.getInstance().getRuneTranslations().get(i).getTranslation());
            }
        }

        System.out.println(message);
        translateToEnglish();
    }
}
