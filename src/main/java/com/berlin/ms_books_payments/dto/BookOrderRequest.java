package com.berlin.ms_books_payments.dto;

import com.berlin.ms_books_payments.data.model.Book;
import lombok.Data;
import java.util.List;

@Data
public class BookOrderRequest {
    private List<Book> books;
}