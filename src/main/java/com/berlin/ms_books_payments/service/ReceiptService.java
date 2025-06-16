package com.berlin.ms_books_payments.service;

import com.berlin.ms_books_payments.dto.BookOrderRequest;
import com.berlin.ms_books_payments.dto.Receipt;
import com.berlin.ms_books_payments.dto.ReceiptItem;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReceiptService {

    public Receipt generateReceipt(BookOrderRequest order) {
        List<ReceiptItem> items = order.getBooks().stream()
            .map(book -> ReceiptItem.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .price(book.getPrice())
                .build())
            .collect(Collectors.toList());

        double total = items.stream()
            .mapToDouble(ReceiptItem::getPrice)
            .sum();

        return Receipt.builder()
            .receiptNumber(UUID.randomUUID().toString())
            .timestamp(LocalDateTime.now())
            .items(items)
            .total(total)
            .build();
    }
}