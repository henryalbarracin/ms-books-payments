package com.berlin.ms_books_payments.dto;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class ReceiptItem {
    private String title;
    private String author;
    private double price;
}