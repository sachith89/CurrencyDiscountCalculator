package dev.sachith.cdc.controller;

import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.dto.InvoiceDto;
import dev.sachith.cdc.service.ShoppingCartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class InvoiceController {

    private final ShoppingCartService shoppingCartService;

    @PostMapping(value = "/calculate")
    public ResponseEntity<InvoiceDto> generateInvoice(@Valid @RequestBody ShoppingCartEntity shoppingCartEntity,
                                                      @RequestParam String apiKey) {
        InvoiceDto response = shoppingCartService.generateInvoice(shoppingCartEntity, apiKey);
        return ResponseEntity.ok(response);
    }

}
