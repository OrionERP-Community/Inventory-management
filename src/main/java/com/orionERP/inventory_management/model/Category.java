package com.orionERP.inventory_management.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    private Long idCategory;
    private String name;
    @OneToMany(mappedBy = "products")
    @JsonBackReference
    private List<Product> products;
    @ManyToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    @JsonManagedReference
    private Inventory inventory; 
}
