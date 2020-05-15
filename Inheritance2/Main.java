package Inheritance2;

import Inheritance2.hero.BladeKnight;
import Inheritance2.hero.MuseElf;
import Inheritance2.hero.SoulMaster;

public class Main {
    public static void main(String[] args) {
        BladeKnight bladeKnight = new BladeKnight("Zozo", 64);
        SoulMaster soulMaster = new SoulMaster("blasda", 12);
        MuseElf museElf = new MuseElf("Fiki", 96);

        System.out.println(bladeKnight.toString());
        System.out.println(soulMaster.toString());
        System.out.println(museElf.toString());
    }
}
