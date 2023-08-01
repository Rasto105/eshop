package sk.tmconsulting.eshop.service;

import sk.tmconsulting.eshop.model.Objednavka;
import java.util.ArrayList;
import java.util.List;

public interface ObjednavkaService {
    List<Objednavka> ziskajVsetkyObjednavky();
    void ulozObjednavku(Objednavka objednavkaObjekt);
    Objednavka ziskajObjednavkuPodlaId(long id);
    void aktualizujObjednavku(Objednavka objednavkaObjekt);
    void odstranObjednavkuPodlaId(long id);
}
