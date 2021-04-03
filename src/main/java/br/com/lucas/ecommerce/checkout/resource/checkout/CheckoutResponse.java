package br.com.lucas.ecommerce.checkout.resource.checkout;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
public class CheckoutResponse implements Serializable {

    private String code;
}
