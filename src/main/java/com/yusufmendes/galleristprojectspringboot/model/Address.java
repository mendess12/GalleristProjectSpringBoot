package com.yusufmendes.galleristprojectspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity {

    @Column(name = "city")
    public String city;

    @Column(name = "district")
    public String district;

    @Column(name = "neighborhood")
    public String neighborhood;

    @Column(name = "street")
    public String street;
}
