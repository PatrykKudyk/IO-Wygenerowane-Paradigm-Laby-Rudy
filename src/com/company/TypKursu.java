package com.company;

public enum TypKursu {
    Wyklad,
    Cwiczenia,
    Laboratoria,
    Projekt,
    Seminaria;

    static public TypKursu GetTypKursu(int typKursu) {
        switch (typKursu) {
            case 0:
                return Wyklad;
            case 1:
                return Cwiczenia;
            case 2:
                return Laboratoria;
            case 3:
                return Projekt;
            default:
                return Seminaria;
        }
    }
}