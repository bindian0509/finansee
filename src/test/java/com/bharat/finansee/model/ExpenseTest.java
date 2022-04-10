package com.bharat.finansee.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : bharat.verma
 * @created : 08/04/22, Friday
 **/
public class ExpenseTest {

    @Test
    void createNewExpense() {
        Expense expense = new Expense();
        expense.setId(UUID.randomUUID().toString());
        expense.setExpense("Burger King Party");
        expense.setAmount(899.00);
        expense.setMode("Credit Card");
        expense.setSubMode("SBI");
        expense.setCategory("Food");
        expense.setSubCategory("Eating out");
        expense.setExpenseDate(LocalDate.now());
        expense.setComment("It was fun cheap and best party!!!");

        assertNotNull(expense);
        assertEquals("Burger King Party", expense.getExpense());
    }

    @Test
    void createExpenseRecord() {
        ExpenseRecord expenseRecord = new ExpenseRecord(
                UUID.randomUUID().toString(),
                "Burger King Party",
                999.00,
                "Food",
                "Eating out",
                "Credit Card",
                "HDFC Bank",
                "I am loving it",
                LocalDate.now()
                );
        assertNotNull(expenseRecord);
        assertEquals(999.00, expenseRecord.amount());
        assertTrue(expenseRecord.getClass().isRecord());
        assertEquals(9, expenseRecord.getClass().getRecordComponents().length);
        
    }
}
