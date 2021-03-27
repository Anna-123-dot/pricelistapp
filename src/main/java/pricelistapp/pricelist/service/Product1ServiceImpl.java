package pricelistapp.pricelist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.repository.Product1Repository;

import java.util.List;

@Component
public class Product1ServiceImpl implements ProductsService{



    @Override
    public List<Product1Repository> getAll() {
        return null;
    }

    @Override
    public Product1Entity getById(Long id) {
        return null;
    }

    @Override
    public List<Product1Entity> getBySize(int size) {
        return null;
    }

    @Override
    public List<Product1Entity> getByHousing(String housing) {
        return null;
    }

    @Override
    public List<Product1Entity> getByDiaphragm(String diaphragm) {
        return null;
    }

    @Override
    public List<Product1Entity> getByValves(String valves) {
        return null;
    }

    @Override
    public List<Product1Entity> getByConnections(String connections) {
        return null;
    }

    @Override
    public List<Product1Entity> getByAirValves(String airValves) {
        return null;
    }

    @Override
    public Product1Entity add(Product1Entity product1Entity) {
        return null;
    }

    @Override
    public Product1Entity modify(int id, Product1Entity product1Entity) {
        return null;
    }

    @Override
    public Product1Entity remove(int id) {
        return null;
    }
}
