package com.example.AoQuadrado.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Calculo {
    @GetMapping("/")
    public String HelloWorld() {
        return "index";
    }

    @PostMapping("/")
    public String postIndex(@RequestParam("numero") int numero,
                            Model model) {
        int resposta = (int) Math.pow(numero, 2);
        model.addAttribute("numero",numero);
        model.addAttribute("resposta", resposta);
        return "index";
    }
}