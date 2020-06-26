package com.neusoft.repository;

import com.neusoft.dataobject.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryReposition extends JpaRepository<ProductCategory,String> {
    Page<ProductCategory>findByCategoryId(String categoryId, Pageable pageable);
}
