package com.webshoppe.repositories;

import com.webshoppe.models.ItemImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemImageriesRepository extends CrudRepository<ItemImage, String> {
}
