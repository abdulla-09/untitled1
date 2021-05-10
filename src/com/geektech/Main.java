package com.geektech;

public class Main {

    public static void main(String[] args) {
	// бегу по трапинки в галаве ляляля
        Hero pitrparker = new Hero();
        pitrparker.Health = 1400;
        pitrparker.Damage = 150;
        pitrparker.superkick = 300;

//явижу тебя и смущяюсь не множко
        boss dryad = new boss();
        dryad.health = 7200;
        dryad.Damage = 50;
dryad.invisibieshield = -150 -300;
        System.out.println(dryad.health + " " + dryad.Damage + " " + dryad.invisibieshield);

    }
}
