package com.example.demo.controller;

import com.example.demo.model.ProviderModel;
import com.example.demo.service.ProviderService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jhonatan Samuel Martinez Hernandez
 */
@RestController
@RequestMapping("Api/v1/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    //------------------  create a new provider in the data base  --------------
    @PostMapping // this method has been tested and works well
    public ProviderModel saveProvider(@RequestBody ProviderModel provider) {
        return this.providerService.saveProvider(provider);

    }
    
    // ----- returns a list of all the registered provider in the data base ----
    @GetMapping 
    public ArrayList<ProviderModel> getProviders() {
        return this.providerService.getProviders();
    }

    //  ---------------  Gets an specific provider by its id number -------------
    @GetMapping("/{id}") 
    public Optional<ProviderModel> getProviderById(@PathVariable("id") Long id) {
        
        System.out.println("El id del ususario: " + id);
        return this.providerService.getById(id);
    }
    
    //---------- modify provider registered contact information ---------------
    @PutMapping("/{id}")
    public ProviderModel modifyProviderById(
            @RequestBody ProviderModel request, 
            @PathVariable("id") Long id) {
        return this.providerService.modifyById(request, id);

    }

    //------- Deletes a priver passing its corresponding it as an argument -----
    @DeleteMapping("/{id}")
    public void deleteProviderById(@PathVariable("id") Long id) {
    // call the service layer and executes the method to delete a selected provider
        this.providerService.deleteProviderById(id);

        
    }
}
