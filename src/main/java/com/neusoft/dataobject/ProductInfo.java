package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Data
public class ProductInfo {
    //产品id
    @Id
    private String productId;
    //产品价格
    private String productPrice;
    //产品名字
    private String productName;
    //产品库存
    private String productStock;
    //产品描述
    private String productDescription;
    //产品图标
    private String productIcon;
    //产品状态
    private String productStatus;
    //种类
    private String categoryType;
    //创建时间
    private Time createTime;
    //更新时间
    private Time updateTime;

}
