package br.com.lucas.ecommerce.checkout.service;

import br.com.lucas.ecommerce.checkout.entity.CheckoutEntity;
import br.com.lucas.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
