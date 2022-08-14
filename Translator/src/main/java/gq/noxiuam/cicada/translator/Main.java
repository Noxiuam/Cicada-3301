package gq.noxiuam.cicada.translator;

import gq.noxiuam.cicada.translator.feature.RuneTranslator;
import gq.noxiuam.cicada.translator.util.Rune;
import lombok.*;
import java.util.*;

@Getter
public class Main {

    @Getter private static Main instance;

    public List<Rune> runeTranslations = new ArrayList<>();

    public String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] runes = new String[]{"ᚪ", "ᛒ", "ᚳ", "ᛞ", "ᛖ", "ᚠ", "ᚷ", "ᚻ", "ᛁ", "ᛄ", "ᚳ", "ᛚ", "ᛗ", "ᚾ", "ᚩ", "ᛈ", "Q", "ᚱ", "ᛋ", "ᛏ", "ᚢ", "V", "ᚹ", "ᛉ", "ᚣ", "ᛋ"};

    public Main() {
        instance = this;

        for (int i = 0; i < this.runes.length; i++) {
            this.runeTranslations.add(new Rune(this.runes[i], this.alphabet[i]));
        }

        System.out.println("Translator Module");
        System.out.println("[1] English to Rune");
        System.out.println("[2] Rune to English");
        System.out.println("Option:");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        if (option.equalsIgnoreCase("1")) {
            RuneTranslator.translateToRunes();
        } else {
            RuneTranslator.translateToEnglish();
        }
    }

}
