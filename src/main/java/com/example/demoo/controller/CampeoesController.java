package com.example.demoo.controller;

import com.example.demoo.models.Campeoes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CampeoesController {
    @GetMapping("/campeoes")
    public String listarCampeoes(Model model) {
        List<Campeoes> campeoes = new ArrayList<>();
        campeoes.add(new Campeoes("Atletico Nacional", 2016, "Borja"));
        campeoes.add(new Campeoes("Gremio", 2017, "Luan"));
        campeoes.add(new Campeoes("River Plate", 2018, "Pratto"));
        campeoes.add(new Campeoes("Flamengo", 2019, "Gabigol"));
        campeoes.add(new Campeoes("Palmeiras", 2020, "Rony"));
        campeoes.add(new Campeoes("Palmeiras", 2021, "Rony"));
        campeoes.add(new Campeoes("Flamengo", 2022, "Pedro"));
        campeoes.add(new Campeoes("Fluminense", 2023, "Cano"));
        campeoes.add(new Campeoes("Atletico Mineiro", 2024, "Hulk"));

        model.addAttribute("campeoes", campeoes);

        return "campeoes";
    }
}
