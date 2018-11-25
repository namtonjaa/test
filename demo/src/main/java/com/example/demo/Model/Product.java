package com.example.demo.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id @GeneratedValue
    private long id;

    private @NonNull String name;
//
    private String desc;
//
    private int cost;

    private Date date;
}
