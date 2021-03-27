package pricelistapp.pricelist.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pricelistapp.pricelist.entity.Product1Entity;

import java.util.List;

@Qualifier("product1")
@Repository
public interface Product1Repository extends CrudRepository<Product1Entity, Long> {

    Product1Entity findById(long id);
    List<Product1Entity> getAll();

}
