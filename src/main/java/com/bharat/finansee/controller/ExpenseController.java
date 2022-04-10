package com.bharat.finansee.controller;

import com.bharat.finansee.model.ExpenseRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : bharat.verma
 * @created : 10/04/22, Sunday
 **/
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    // https://localhost:8080/expenses
    @GetMapping("/")
    public List<ExpenseRecord> findAll () {
        return null;
    }
}
