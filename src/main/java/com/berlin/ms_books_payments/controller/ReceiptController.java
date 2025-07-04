package com.berlin.ms_books_payments.controller;

import com.berlin.ms_books_payments.dto.BookOrderRequest;
import com.berlin.ms_books_payments.dto.Receipt;
import com.berlin.ms_books_payments.service.ReceiptService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/receipts")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptService receiptService;

    @GetMapping("/test")
    public String test() {
        return "test: respuesta de prueba de micro ms-books-payments";
    }

    @PostMapping
    public Receipt generateReceipt(@RequestBody BookOrderRequest order) {
        return receiptService.generateReceipt(order);
    }
}