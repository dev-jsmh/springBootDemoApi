
package com.example.demo.controller;

/*

Developed by Jhonatan Samuel Martinez Hernandez year 2024


 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jhonatan Samuel Martinez Hernandez year 2024
 */
@RestController(value = "/clients")
public class ClientController {

  

    @GetMapping
    public String getAll(){
        return "Testin controller url for clientes en demo project.";
    }

}
