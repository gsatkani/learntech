package com.tek.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int oid;
     private String oName;
     private double oPrice;
     private LocalDate oDate;
     private int eId;
}
