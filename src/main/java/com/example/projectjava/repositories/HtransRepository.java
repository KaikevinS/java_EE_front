package com.example.projectjava.repositories;

import com.example.projectjava.models.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HtransRepository extends JpaRepository<Transaksi, Integer> {
    List<Transaksi> findAllByStatusIsNotNullOrderByPeriodeDescUserAsc ( );
}
