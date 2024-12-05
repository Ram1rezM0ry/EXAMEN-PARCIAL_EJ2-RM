package com.example.EXAMENPARCIAL_RM_EJ2.controller;

import com.example.EXAMENPARCIAL_RM_EJ2.model.RegistroVenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {

    @RequestMapping("/registro-venta")
    public String registroForm(Model model) {
        model.addAttribute("registroVenta", new RegistroVenta());
        return "registro-venta"; // Devuelve el formulario
    }

    @PostMapping("/registro-venta")
    public String procesarRegistro(@ModelAttribute RegistroVenta registroVenta, Model model) {   
        model.addAttribute("registroVenta", registroVenta); // Muestra los datos al usuario
        return "registro-exito"; // Redirige a la vista de éxito
    }
}