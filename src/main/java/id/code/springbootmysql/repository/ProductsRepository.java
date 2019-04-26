package id.code.springbootmysql.repository;

import id.code.springbootmysql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//TODO membuat Product Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
