package com.example.projectjava.models;

import com.example.projectjava.repositories.HtransRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Table(name = "trans")
@Getter
@Setter
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate by mysql
    private int id;

    @ManyToOne
    @JoinColumn( name = "idperiode", nullable = false)
    private Periode periode;

    @ManyToOne
    @JoinColumn(name = "iduser",nullable = false)
    private User user;

    private int status;
    private String pos;

    private double nominal;

    private String deskripsi;
    private String tanggal;

}



