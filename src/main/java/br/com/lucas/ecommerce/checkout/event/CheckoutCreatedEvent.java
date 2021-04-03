package br.com.lucas.ecommerce.checkout.event;

import br.com.lucas.ecommerce.checkout.entity.CheckoutEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class CheckoutCreatedEvent {

    private String code;
    private CheckoutEntity.Status status;
}
