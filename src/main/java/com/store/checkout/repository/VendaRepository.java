package com.store.checkout.repository;

import com.store.checkout.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long>{
    
}
