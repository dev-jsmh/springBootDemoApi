
package com.example.demo.repository;

import com.example.demo.model.ProviderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author samuel
 */
@Repository
public interface IproviderRepository extends JpaRepository<ProviderModel, Long> {
    

 
}
