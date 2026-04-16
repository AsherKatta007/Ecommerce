package com.scaler.backendproject.models;
package com.scaler.backendproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

public class Product {
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
}
