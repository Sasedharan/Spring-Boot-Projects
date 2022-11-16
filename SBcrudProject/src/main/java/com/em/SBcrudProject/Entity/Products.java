package com.em.SBcrudProject.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "E_Product", schema = "e_commerce")
public class Products {
    @Id

      /*  @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "rate",sequenceName = "Seq_table",initialValue = 1)*/

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int srNo;

    @Column(name = "productName")
    private String itemName;
    private int quantity;

    @Column(nullable = false)
    private String qCheck;
    private long rate;

    @CreationTimestamp
    private LocalDateTime manDate;

    @UpdateTimestamp
    private LocalDateTime updateTime;

}
