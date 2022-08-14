package gq.noxiuam.cicada.translator.util;

import lombok.*;

/**
 * Defines a Rune object, this can be use in many ways if needed.
 */
@Getter @AllArgsConstructor
public class Rune {
    private String rune;
    private String translation;
    private String secondTranslation;
    private int numericalValue;

    public Rune(String rune, String translation) {
        this.rune = rune;
        this.translation = translation;
    }

    public Rune(String rune, String translation, String secondTranslation) {
        this.rune = rune;
        this.translation = translation;
        this.secondTranslation = secondTranslation;
    }
}
