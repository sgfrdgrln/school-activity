
import java.util.*;

public class CharacterCustomize {

    public static void main(String[] args) {
        
    }

}

class Character {

    private CharacterClass characterClass;
    private HairColor hairColor;
    private EyeColor eyeColor;
    private CharacterHeight characterHeight;
    private CharacterGender characterGender;
    private UniqueSkill uniqueSkill;
    private int power;


    public Character(CharacterClass characterClass, HairColor hairColor, EyeColor eyeColor, CharacterHeight characterHeight, CharacterGender characterGender, UniqueSkill uniqueSkill, int power) {

        this.characterClass = characterClass;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.characterHeight = characterHeight;
        this.characterGender = characterGender;
        this.uniqueSkill = uniqueSkill;
        this.power = power;

    }


    public static boolean isLetter(char charAt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLetter'");
    }

}

enum CharacterClass {

    FIGHTER, ROGUE, PALADIN, MAGE, ARCHER, ASSASSIN

}

enum HairColor {

    WHITE, GREEN, PURPLE, BLUE, RED, YELLOW, BLACK

}

enum SkinColor {

    WHITE, BEIGE, BROWN, BLACK 

}

enum EyeColor {

    RUBY, GREEN, PURPLE, BLUE, RED, YELLOW, BLACK, EMERALD, TOPAZ, AQUAMARINE

}

enum CharacterHeight {

    VERY_SHORT, SHORT, MEDIUM, TALL, VERY_TALL

}
enum CharacterGender {

    MALE, FEMALE, GENDER_FLUID

}

enum UniqueSkill {

    FAST_GROWTH, ENDURE, VENGEANCE, VISION

}

