package br.com.lucas.ecommerce.checkout.streaming;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedSource {    // Produtor

    String OUTPUT = "checkout-created-output";

    @Output(OUTPUT)
    MessageChannel output();
}
