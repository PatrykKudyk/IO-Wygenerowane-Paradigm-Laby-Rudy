package com.company;

public enum DzienTygodnia {
    Poniedzialek,
    Wtorek,
    Sroda,
    Czwartek,
    Piatek,
    Sobota,
    Niedziela;

    static public DzienTygodnia GetDzienTygodnia(int dzienTygodnia) {
        switch (dzienTygodnia) {
            case 0:
                return Poniedzialek;
            case 1:
                return Wtorek;
            case 2:
                return Sroda;
            case 3:
                return Czwartek;
            case 4:
                return Piatek;
            case 5:
                return Sobota;
            default:
                return Niedziela;
        }
    }
}