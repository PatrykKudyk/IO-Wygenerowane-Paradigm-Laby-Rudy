package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaUzytkownikow {

    private List<List<PrawoDoZapisu>> ListaListPrawDoZapisow;

    public List<GrupaZapisowa> SprawdzGrupyPrzypisane(int IDStudenta, ZarzadcaKursow zarzadcaKursow) {
        //pobranie grup zapisowych dla studenta o id = IDSturenta
        return zarzadcaKursow.PobierzListeGrupZapisowych(IDStudenta);
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