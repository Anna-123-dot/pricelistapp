package pricelistapp.pricelist.mapper;

import pricelistapp.pricelist.entity.Product2Entity;
import pricelistapp.pricelist.model.Product2Dto;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static List<Product2Dto> mapEntityListToDtoList(List<Product2Entity> entities) {

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
