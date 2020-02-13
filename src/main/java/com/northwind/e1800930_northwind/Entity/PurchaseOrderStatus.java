package com.northwind.e1800930_northwind.Entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.northwind.e1800930_northwind.Entity.PurchaseOrderStatus")
@Table(name = "purchase_order_status")
public class PurchaseOrderStatus {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status\"", nullable = true)
  private String status;
}