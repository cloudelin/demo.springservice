package org.vgl.service.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.vgl.service.data.model.Item;

/**
 * 
 * @author Cloude
 *
 */
public interface ItemDao extends CrudRepository<Item, Long>{

}
