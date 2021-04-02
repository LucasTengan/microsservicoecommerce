package br.com.lucas.ecommerce.checkout.service;

import br.com.lucas.ecommerce.checkout.entity.CheckoutEntity;
import br.com.lucas.ecommerce.checkout.repository.CheckoutRepository;
import br.com.lucas.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceimpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();

        CheckoutEntity savedCheckout = checkoutRepository.save(checkoutEntity);

        return Optional.of(savedCheckout);
    }
}
