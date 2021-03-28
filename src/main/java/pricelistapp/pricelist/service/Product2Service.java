package pricelistapp.pricelist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pricelistapp.pricelist.entity.Product2Entity;
import pricelistapp.pricelist.mapper.ProductMapper;
import pricelistapp.pricelist.model.Product2Dto;
import pricelistapp.pricelist.repository.Product2Repository;

import java.util.List;

@Service
public class Product2Service {

    @Autowired
    private Product2Repository product2Repository;



    public List<Product2Dto> findAll() {
        List<Product2Entity> product2Entity = product2Repository.findAll();
        List<Product2Dto> product2Dtos = ProductMapper.mapEntityListToDtoList(product2Entity);
        return product2Dtos;

    }

    public boolean add(Product2Dto product2Dto) {

        Product2Entity product2Entity = new Product2Entity();
        product2Entity.setDescription(product2Dto.getDescription());
        product2Entity.setBSP(product2Dto.getBSP());
        product2Entity.setHousing(product2Dto.getHousing());
        product2Entity.setDiaphragm(product2Dto.getDiaphragm());
        product2Entity.setValves(product2Dto.getValves());
        product2Entity.setRemark(product2Dto.getRemark());
        product2Entity.setPrice(product2Dto.getPrice());


        try {
            product2Repository.save(product2Entity);
            return true;
        } catch (Exception exception) {
            // handle exception
            return false;
        }
    }

    //1.parametr do metody Product1Dto
    //2.zamienić Product1Dto na Product1Entity
    //3.zapisać Product1Entity do repozytorium


    public boolean modify(int id, Product2Dto product1Dto) {
        return false;
    }


    public boolean remove(int id, Product2Dto product1Dto) {

        return false;
    }

}

