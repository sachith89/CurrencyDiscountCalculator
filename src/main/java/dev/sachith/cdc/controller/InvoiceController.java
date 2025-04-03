package dev.sachith.cdc.controller;
import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.dto.InvoiceDto;
import dev.sachith.cdc.service.ShoppingCartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class InvoiceController {

  private final ShoppingCartService shoppingCartService;

  @PostMapping(value = "/calculate")
  public ResponseEntity<InvoiceDto> generateInvoice(@Valid @RequestBody ShoppingCartEntity shoppingCartEntity) {
    InvoiceDto response = shoppingCartService.generateInvoice(shoppingCartEntity);
    return ResponseEntity.ok(response);
  }

}
