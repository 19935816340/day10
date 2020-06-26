package com.neusoft.dataobject;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

/*dataobject中的类即是实体类
他是与数据库中的表字段一一对应的类
写成javaBean模式*/
@Entity
@Data
public class OrderMaster {
    //订单id
    @Id
    private String orderID;
    //卖家姓名
    private String buyerName;
    //卖家电话
    private String buyerPhone;
    //卖家地址
    private String buyAddress;
    //微信平台检索id
    private String buyerOpenid;
    //订单金额
    private Double orderAmount;
    //订单状态
    private String orderStatus;
    //支付状态
    private String payStatus;
    //创建时间
    private Time createTime;
    //最近更新时间
    private Time updateTime;
}
