package com.berlin.ms_books_payments.controller;

import com.berlin.ms_books_payments.dto.BookOrderRequest;
import com.berlin.ms_books_payments.dto.Receipt;
import com.berlin.ms_books_payments.service.ReceiptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/receipts")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptService receiptService;

    @PostMapping
    public Receipt generateReceipt(@RequestBody BookOrderRequest order) {
        return receiptService.generateReceipt(order);
    }
}