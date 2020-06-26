package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Data
public class OrderDetail {
    //详单id
    @Id
    private String detailId;
    //订单id
    private String orderId;
    //产品id
    private String productId;
    //产品名字
    private String productName;
    //产品价格
    private Double productPrice;
    //产品数量
    private String productQuantity;
    //产品图标
    private String productIcon;
    //创建时间
    private Time createTime;
    //上次更新时间
    private Time updateTime;

}
