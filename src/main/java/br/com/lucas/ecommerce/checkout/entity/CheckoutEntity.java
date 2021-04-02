package br.com.lucas.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Builder
@NoArgsConstructor
public class CheckoutEntity {

    @javax.persistence.Id
    @Id
    private Long id;
    @Column
    private String code;

}
