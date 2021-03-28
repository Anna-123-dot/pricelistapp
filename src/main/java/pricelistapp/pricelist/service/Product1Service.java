package pricelistapp.pricelist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.model.Product1Dto;
import pricelistapp.pricelist.model.Product2Dto;
import pricelistapp.pricelist.repository.Product1Repository;

import java.util.List;

@Service
public class Product1Service {

    @Autowired
    private Product1Repository product1Repository;



    public List<Product1Dto> findAll() {
        return null;
    }

    public boolean add(Product1Dto product1Dto) {

        Product1Entity product1Entity = new Product1Entity();
        product1Entity.setSize(product1Dto.getSize());
        product1Entity.setAirValve(product1Dto.getAirValves());
        product1Entity.setConnections(product1Dto.getConnections());
        product1Entity.setDiaphragm(product1Dto.getDiaphragm());
        product1Entity.setHousing(product1Dto.getHousing());
        product1Entity.setValves(product1Dto.getValves());
        product1Entity.setPrice(product1Dto.getPrice());


        try {
            product1Repository.save(product1Entity);
            return true;
        } catch (Exception exception) {
            // handle exception
            return false;
        }
    }

    //1.parametr do metody Product1Dto
    //2.zamienić Product1Dto na Product1Entity
    //3.zapisać Product1Entity do repozytorium



    public boolean modify(int id, Product1Dto product1Dto) {
        return false;
    }


    public boolean remove(int id, Product1Dto product1Dto) {

        return false;
    }

    public Product1Dto getById(long id) {
    return null;
    }
}

