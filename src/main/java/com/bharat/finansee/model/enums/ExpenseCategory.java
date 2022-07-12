package com.bharat.finansee.model.enums;

/**
 * @author Bharat Verma  on Sun, 01-Apr-2018
 */
public enum ExpenseCategory {

    HOUSING(1,"Housing"),
    FOOD(2,"Food"),
    HEALTH(3,"Health"),
    GROOMING(4,"Grooming"),
    TRANSPORTATION(5,"Transportation"),
    ENTERTAINMENT(6,"Entertainment"),
    EDUCATION(7,"Education"),
    MISCELLANEOUS(8, "Misc");

    private int id;
    private String label;

    ExpenseCategory(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public static ExpenseCategory getById(int value) {
        switch (value) {
            case 1 :
                return HOUSING;
            case 2:
                return FOOD;
            case 3:
                return HEALTH;
            case 4:
                return GROOMING;
            case 5:
                return TRANSPORTATION;
            case 6:
                return ENTERTAINMENT;
            case 7:
                return EDUCATION;
            case 8:
                return MISCELLANEOUS;
            default:
                throw new IllegalArgumentException("Expense Category");

        }
    }

    public static ExpenseCategory findByLabel(String byLabel) {
        for(ExpenseCategory r:ExpenseCategory.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }

    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }
}
