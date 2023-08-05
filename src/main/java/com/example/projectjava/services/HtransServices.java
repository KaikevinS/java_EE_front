package com.example.projectjava.services;

import com.example.projectjava.models.Transaksi;
import com.example.projectjava.repositories.HtransRepository;
import jakarta.persistence.OrderBy;
import jakarta.persistence.OrderColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HtransServices {
    @Autowired
    HtransRepository repo;

//    @OrderBy("idperiode DESC")
    public List<Transaksi> getByPeriode(){
        List<Transaksi> transaksis = repo.findAll();
        return repo.findAllByStatusIsNotNullOrderByPeriodeDescUserAsc();
//        return repo.findAll(Sort.by(Sort.Direction.DESC,"periode"));
//        return repo.findAll();
    }


//    public List<Transaksi> getByStatus(int status){
//        return rep(status);
//    }

}
