package com.dt2.gtavi.repository;
import com.dt2.gtavi.entities.Carros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<Carros, Integer> {
}
