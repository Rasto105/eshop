package sk.tmconsulting.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.tmconsulting.eshop.model.Objednavka;
import sk.tmconsulting.eshop.repository.ObjednavkaRepository;

import java.util.ArrayList;
import java.util.List;
@Service // Anotacia sluzby, ktora "sprevadzkuje" sluzby databazy
public class ObjednavkaServiceImpl implements ObjednavkaService{
    @Autowired
    ObjednavkaRepository objednavkaRepository;
    @Override
    public List<Objednavka> ziskajVsetkyObjednavky() {
        return objednavkaRepository.findAll();
    }

    @Override
    public void ulozObjednavku(Objednavka objednavkaObjekt) {
      objednavkaRepository.save(objednavkaObjekt);
    }

    @Override
    public Objednavka ziskajObjednavkuPodlaId(long id) {
        return objednavkaRepository.findById(id).get();
    }

    @Override
    public void aktualizujObjednavku(Objednavka objednavkaObjekt) {
      objednavkaRepository.save(objednavkaObjekt);

    }

    @Override
    public void odstranObjednavkuPodlaId(long id) {
      objednavkaRepository.deleteById(id);
    }
}
