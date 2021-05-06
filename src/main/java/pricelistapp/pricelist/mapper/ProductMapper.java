package pricelistapp.pricelist.mapper;

import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.entity.Product2Entity;
import pricelistapp.pricelist.model.Product1Dto;
import pricelistapp.pricelist.model.Product2Dto;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static List<Product1Dto> mapEntityListToDtoList1(List<Product1Entity> entities) {

        List<Product1Dto> result = new ArrayList<>();

        for (Product1Entity entity : entities) {
            Product1Dto product1Dto = mapEntityToDto(entity);
            result.add(product1Dto);
        }

        return result;
    }

    public static Product1Dto mapEntityToDto(Product1Entity entity) {

        return new Product1Dto(
                entity.getId(),
                entity.getSize(),
                entity.getHousing(),
                entity.getDiaphragm(),
                entity.getValves(),
                entity.getConnections(),
                entity.getAirValve(),
                entity.getPrice());
    }

    public static List<Product2Dto> mapEntityListToDtoList2(List<Product2Entity> entities) {

        List<Product2Dto> result = new ArrayList<>();

        for (Product2Entity entity : entities) {
            Product2Dto product2Dto = mapEntityToDto(entity);
            result.add(product2Dto);
        }

        return result;
    }

    public static Product2Dto mapEntityToDto(Product2Entity entity) {

        return new Product2Dto(
                entity.getId(),
                entity.getDescription(),
                entity.getBSP(),
                entity.getHousing(),
                entity.getDiaphragm(),
                entity.getValves(),
                entity.getRemark(),
                entity.getPrice());
    }
}
