package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Data
public class ProductCategory {
    //种类id
    @Id
    private String categoryId;
    //种类名
    private String categoryName;
    private String categoryType;
    //创建时间
    private Time createTime;
    //更新时间
    private Time updateTime;

}
