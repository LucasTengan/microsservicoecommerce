package br.com.lucas.ecommerce.checkout.service;

import br.com.lucas.ecommerce.checkout.entity.CheckoutEntity;
import br.com.lucas.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.com.lucas.ecommerce.checkout.repository.CheckoutRepository;
import br.com.lucas.ecommerce.checkout.resource.checkout.CheckoutRequest;
import br.com.lucas.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceimpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();

        CheckoutEntity savedCheckout = checkoutRepository.save(checkoutEntity);

        final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent.builder()
                .code(savedCheckout.getCode())
                .status(savedCheckout.getStatus())
                .build();
        checkoutCreatedSource.output().send(MessageBuilder.withPayload(checkoutCreatedEvent).build());

        return Optional.of(savedCheckout);
    }
}
