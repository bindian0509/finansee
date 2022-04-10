package com.bharat.finansee.repository;

import com.bharat.finansee.model.ExpenseRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author : bharat.verma
 * @created : 10/04/22, Sunday
 **/
public class ExpenseRepository {

    private List<ExpenseRecord> expenses = new ArrayList<>();

    public ExpenseRepository() {
        expenses.add(new ExpenseRecord(
                UUID.randomUUID().toString(),
                "Burger King Party",
                999.00,
                "Food",
                "Eating out",
                "Credit Card",
                "HDFC Bank",
                "I am loving it",
                LocalDate.now()
        ));
    }

    public List<ExpenseRecord> findAll() {
        return this.expenses;
    }

    public ExpenseRecord findById(String id) {
        return this.expenses.stream().filter(
                expenseRecord -> expenseRecord.id().equals(id)).findFirst().orElse(null);
    }
}
