package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.awt.color.ProfileDataException;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //query method sample
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockIsLessThanAndEstado(int cantidadStock, boolean estado);
}
