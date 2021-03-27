package pricelistapp.pricelist.service;

import org.springframework.stereotype.Service;
import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.model.Product1Dto;
import pricelistapp.pricelist.repository.Product1Repository;

import java.util.List;

@Service
public interface ProductsService {
   List<Product1Repository> getAll();
    Product1Entity getById(Long id);
    List<Product1Entity> getBySize(int size);
    List<Product1Entity> getByHousing(String housing);
    List<Product1Entity> getByDiaphragm(String diaphragm);
    List<Product1Entity> getByValves(String valves);
    List<Product1Entity> getByConnections(String connections);
    List<Product1Entity> getByAirValves(String airValves);


    Product1Entity add(Product1Entity product1Entity);
    Product1Entity modify(int id, Product1Entity product1Entity);
    Product1Entity remove(int id);


}
