package com.neusoft.repository;

import com.neusoft.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoReposition extends JpaRepository<ProductInfoReposition,String> {
    Page<ProductInfo>findByProductId(String productId, Pageable pageable);
}
