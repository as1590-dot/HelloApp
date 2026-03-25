import java.util.*;

public class uc7 {

    // Inner class to store character and its pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}