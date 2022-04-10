package com.bharat.finansee.model;

import java.time.LocalDate;

/**
 * @author : bharat.verma
 * @created : 08/04/22, Friday
 **/
public class Expense {

    private String id;
    private String expense;
    private Double amount;
    private String category;
    private String subCategory;
    private String mode;
    private String subMode;
    private String comment;
    private LocalDate expenseDate;

    public Expense() {
    }

    public Expense(String id, String expense, Double amount, String category, String subCategory, String mode, String subMode, String comment, LocalDate expenseDate) {
        this.id = id;
        this.expense = expense;
        this.amount = amount;
        this.category = category;
        this.subCategory = subCategory;
        this.mode = mode;
        this.subMode = subMode;
        this.comment = comment;
        this.expenseDate = expenseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getSubMode() {
        return subMode;
    }

    public void setSubMode(String subMode) {
        this.subMode = subMode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Override
    public String toString() {
        String sb = "Expense{" + "id='" + id + '\'' +
                ", expense='" + expense + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", mode='" + mode + '\'' +
                ", subMode='" + subMode + '\'' +
                ", comment='" + comment + '\'' +
                ", expenseDate=" + expenseDate +
                '}';
        return sb;
    }
}
