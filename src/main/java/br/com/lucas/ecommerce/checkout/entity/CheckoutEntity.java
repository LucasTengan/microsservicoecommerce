package br.com.lucas.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
public class CheckoutEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String code;
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        CREATED,
        APPROVED
    }
}
