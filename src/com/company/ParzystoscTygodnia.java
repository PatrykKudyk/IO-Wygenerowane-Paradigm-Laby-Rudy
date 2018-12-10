package com.company;

public enum ParzystoscTygodnia {
    Parzysty,
    Nieparzysty,
    Laczny;

    static public ParzystoscTygodnia GetParzystoscTygodnia(int parzystoscTygodnia) {
        switch (parzystoscTygodnia) {
            case 0:
                return Parzysty;
            case 1:
                return Nieparzysty;
            default:
                return Laczny;
        }
    }
}