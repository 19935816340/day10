package com.neusoft.repository;

import com.neusoft.dataobject.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailReposition extends JpaRepository<OrderDetailReposition,String> {
    Page<OrderDetail>findByDetailID(String detailId, Pageable pageable);
}
