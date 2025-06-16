package com.berlin.ms_books_payments.dto;

import lombok.Data;
import lombok.Builder;
import java.util.List;
import java.time.LocalDateTime;

@Data
@Builder
public class Receipt {
    private String receiptNumber;
    private LocalDateTime timestamp;
    private List<ReceiptItem> items;
    private double total;
}