package com.example.projectjava.controller;

import com.example.projectjava.models.Transaksi;
import com.example.projectjava.services.HtransServices;
import jakarta.persistence.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TransaksiController {
    @Autowired
    HtransServices service;

    @RequestMapping("/trans/")
    public String bukaIndex(Model model){
        List<Transaksi> daftarTrans = service.getByPeriode();

//        List<Transaksi> daftarBudget = service.getByStatus(0);
        model.addAttribute("trans", daftarTrans);
//        model.addAttribute("budget",daftarBudget);
        return "index";
    }

}
