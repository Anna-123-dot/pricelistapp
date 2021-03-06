package pricelistapp.pricelist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pricelistapp.pricelist.entity.Product1Entity;

import java.util.List;


@Repository
public interface Product1Repository extends CrudRepository<Product1Entity, Long> {

    Product1Entity findById(long id);

    List<Product1Entity> findAll();

}
