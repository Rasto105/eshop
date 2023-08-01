package sk.tmconsulting.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.tmconsulting.eshop.model.Objednavka;

public interface ObjednavkaRepository extends JpaRepository<Objednavka,Long> {
}
