package com.example.projectjava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "periode")
@Getter
@Setter
public class Periode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate by mysql
    private int id;

    private String tahun;

    private String bulan;

    @OneToMany(mappedBy = "periode")
    private List<Transaksi> transaksis;


}
