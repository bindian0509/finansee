package com.bharat.finansee.model;

import java.time.LocalDate;

public record ExpenseRecord(String id, String expense, Double amount, String category, String subCategory, String mode, String subMode, String comment, LocalDate expenseDate) {
    
}
