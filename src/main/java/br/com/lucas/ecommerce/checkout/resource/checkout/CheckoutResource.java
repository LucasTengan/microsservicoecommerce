package br.com.lucas.ecommerce.checkout.resource.checkout;

import br.com.lucas.ecommerce.checkout.service.CheckoutService;
import br.com.lucas.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/checkout")
public class CheckoutResource {

    private final CheckoutCreatedSource checkoutCreatedSource;
    private final CheckoutService checkoutService;

    @PostMapping
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
        checkoutService.create(checkoutRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
