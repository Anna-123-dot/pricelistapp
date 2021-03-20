package pricelistapp.pricelist.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pricelistapp.pricelist.entity.RoleEntity;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
}
