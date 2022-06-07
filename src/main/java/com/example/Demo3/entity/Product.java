package com.example.Demo3.entity;

import com.example.Demo3.annotation.Column;
import com.example.Demo3.annotation.Id;
import com.example.Demo3.annotation.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "products")
public class Product {
    @Id(autoIncrement = true)
    @Column(name = "id", type = "INT")
    private Integer id;
    @Column(name = "name", type = "VARCHAR(255)")
    private String name;
    @Column(name = "price", type = "DECIMAL")
    private BigDecimal price;
}
