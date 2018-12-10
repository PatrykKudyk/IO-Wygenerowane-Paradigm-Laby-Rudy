package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaUzytkownikow {

    private List<List<PrawoDoZapisu>> ListaListPrawDoZapisow;

    public List<GrupaZapisowa> SprawdzGrupyPrzypisane(int IDStudenta) {
        ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
        List<GrupaZapisowa> lista = zarzadcaKursow.PobierzListeGrupZapisowych(IDStudenta);
        //pobranie grup zapisowych dla studenta o id = IDSturenta

        return lista;
    }

    public List<PrawoDoZapisu> SprawdzPrawaDoZapisow(int IDStudenta) {
        List<PrawoDoZapisu> lista = new ArrayList<PrawoDoZapisu>();

        lista.add(new PrawoDoZapisu(1));

        return lista;
    }

    public List<List<PrawoDoZapisu>> getListaListPrawDoZapisow() {
        return ListaListPrawDoZapisow;
    }

    public void setListaListPrawDoZapisow(List<List<PrawoDoZapisu>> listaListPrawDoZapisow) {
        ListaListPrawDoZapisow = listaListPrawDoZapisow;
    }
}