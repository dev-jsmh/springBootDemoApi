/*
Developed by Jhonatan Samuel Martinez Hernandez year 2024
Software Analyst and Developer
 */
package com.example.demo.service;

import com.example.demo.model.ProviderModel;
import com.example.demo.repository.IproviderRepository;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jhonatan Samuel Martinez Hernandez
 */
@Service
public class ProviderService {

    private final IproviderRepository providerRepository;

    @Autowired
    public ProviderService(IproviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    /*
     save client   --------------------------------
     */
    // function that allows us to save providers data 
    public ProviderModel saveProvider(ProviderModel provider) {

        try {
            return providerRepository.save(provider);
        } catch (Exception ex) {
            throw new RuntimeException("New provider info could have not been saved correctly. " + ex.getMessage());
        }

    }

    /*
     read list of clients   --------------------------------
     */
    // function that gets all providers from the data base
    public ArrayList<ProviderModel> getProviders() {

        try {
            return (ArrayList<ProviderModel>) providerRepository.findAll();
        } catch (Exception ex) {
            throw new RuntimeException("A list of existing providers could have not been returned. " + ex.getMessage());
        }
    }

    //gets a client by it's id  ---------------------------------
    // I can get an exact provider by it's id
    public Optional<ProviderModel> getById(Long id) {
        try {
            return this.providerRepository.findById(id);
        } catch (Exception ex) {
            throw new RuntimeException("Desired provider could have not been selected. " + ex.getMessage());
        }
    }

    /*
     modify client info ---------------------------------
     */
    // I modify Providers information with this functionality
    public ProviderModel modifyById(ProviderModel request, Long id) {
        try {// find the provider by it's Id bu it returns me and entity
            Optional<ProviderModel> optionalProvider = providerRepository.findById(id);
            // here i have taken the retutn optional and extract the object/entity 
            //with the .get() function
            ProviderModel provider = optionalProvider.get();

            // set the parameters for each column using the request
            //variable to use the getters
            //provider.setId_provider(request.getId_provider());
            provider.setName(request.getName());
            provider.setPhone(request.getPhone());
            provider.setAddress(request.getAddress());
            // executes the a method form repository that allows to save the modify 
            //data of the entity
            return this.providerRepository.save(provider);
        } catch (Exception ex) {
            throw new RuntimeException("Provider could not have been save. " + ex.getMessage());
        }

    }

    /*
     ---------------------- delete client-------------------------------
     */
    // deletes an expecific provider by it's id number
    public void deleteProviderById(Long id) {
        try {
            this.providerRepository.deleteById(id);
            System.out.println("El proveedor se ha aliminado exitosamente.");
        } catch (Exception ex) {
            throw new RuntimeException("Error al intentar borrar el cliente. " + ex.getMessage());
        }
    }
}
