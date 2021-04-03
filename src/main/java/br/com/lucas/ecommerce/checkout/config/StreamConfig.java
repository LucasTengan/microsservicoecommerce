package br.com.lucas.ecommerce.checkout.config;

import br.com.lucas.ecommerce.checkout.streaming.CheckoutCreatedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class
})
public class StreamConfig {
}
