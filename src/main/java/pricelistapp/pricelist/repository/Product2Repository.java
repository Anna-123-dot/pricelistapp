package pricelistapp.pricelist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.entity.Product2Entity;

import java.util.List;


@Repository
public interface Product2Repository extends CrudRepository<Product2Entity, Long> {

    List<Product2Entity> findAll();

}
