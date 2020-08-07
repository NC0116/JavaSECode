package com.neusoft.dataobject;



//dataobject 中的类即使实体类

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

//它是与数据库中表字段一一对应的类
//写成javaBean模式
@Entity
@Data
public class OrderMaster {
    //买家订单id
    //@Getter
   // @Setter
    @Id
    private String orderId;
    //买家名字
    private String buyerName;
    //订单的总金额
    private BigDecimal oderAmount;
    //
}
