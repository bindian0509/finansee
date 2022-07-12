package com.bharat.finansee.model.enums;

/**
 * @author Bharat Verma  on Sun, 01-Apr-2018
 */
public enum ExpenseSubCategory {

    HOME_LOAN_EMI(1, ExpenseCategory.HOUSING, "Home Loan EMI"),
    HOUSE_RENT(2, ExpenseCategory.HOUSING, "House Rent"),
    MAINTENANCE(3, ExpenseCategory.HOUSING, "Maintenance"),
    ELECTRICITY(4, ExpenseCategory.HOUSING, "Electricity"),
    WATER(5, ExpenseCategory.HOUSING, "Water"),
    HOUSE_CLEANING(6, ExpenseCategory.HOUSING, "House Cleaning"),
    PHONE_BILL(7, ExpenseCategory.HOUSING, "Mobile Phone Bills"),
    LANDLINE_INTERNET(8, ExpenseCategory.HOUSING, "Landline & Internet Bill"),

    GROCERIES(9, ExpenseCategory.FOOD, "Groceries"),
    ALCOHOL(10, ExpenseCategory.FOOD, "Alcohol"),
    SWEETS_CAKES(11, ExpenseCategory.FOOD, "Sweets or Cakes"),
    EATING_OUT(12, ExpenseCategory.FOOD, "Eating out"),

    MEDICAL_INSURANCE(13, ExpenseCategory.HEALTH, "Health Insurance"),
    MEDICATION(14, ExpenseCategory.HEALTH, "Medications (Consulation, Vaccinations, Medicines"),
    HEALTH_MAINTENANCE(15, ExpenseCategory.HEALTH, "Gym Memberships, Yoga, Sports"),

    CLOTHING(16, ExpenseCategory.GROOMING, "Clothing"),
    SALON_SPA(17, ExpenseCategory.GROOMING, "Saloon or Spa"),
    PERSONAL_CARE(18, ExpenseCategory.GROOMING, "Personal care or Makeup items"),

    CAR_EMI(19, ExpenseCategory.TRANSPORTATION, "Car EMI"),
    CAR_INSURANCE(20, ExpenseCategory.TRANSPORTATION, "Car Insurance"),
    CAR_MAINTENANCE(21, ExpenseCategory.TRANSPORTATION, "Car Maintenance"),
    CAR_FUEL(22, ExpenseCategory.TRANSPORTATION, "Car Fuel"),
    PARKING(23, ExpenseCategory.TRANSPORTATION, "Parking"),
    PUBLIC_TRANSPORTATION(24, ExpenseCategory.TRANSPORTATION, "Public Transport"),

    MOVIES_CONCERTS(25, ExpenseCategory.ENTERTAINMENT, "Movies or Concerts"),
    MAGAZINE_NEWSPAPER(26, ExpenseCategory.ENTERTAINMENT, "Magazines or Newspaper"),
    ONLINE_SUBSCRIPTIONS(27, ExpenseCategory.ENTERTAINMENT, "Online Subscription"),
    CABLE_TV_DTH(28, ExpenseCategory.ENTERTAINMENT, "Cable TV or DTH"),
    VACATIONS__PERSONAL_TRAVELS(29, ExpenseCategory.ENTERTAINMENT, "Vacations or personal travels"),

    BOOKS_SOFTWARE(30, ExpenseCategory.EDUCATION, "Books or software supplies"),
    COURSES_TEST(31, ExpenseCategory.EDUCATION, "Courses or Test Fees"),
    CHILD_SCHOOL_FEES(32, ExpenseCategory.EDUCATION, "Child Schoo Fees"),

    GIFTS(33, ExpenseCategory.MISCELLANEOUS, "Gifts"),
    CHARITY(34, ExpenseCategory.MISCELLANEOUS, "Charity"),
    OTHER_EMI(35, ExpenseCategory.MISCELLANEOUS, "Other EMI");

    private ExpenseCategory expenseCategory;
    private String label;
    private int id;

    ExpenseSubCategory(int id, ExpenseCategory expenseCategory, String label) {
        this.id = id;
        this.expenseCategory = expenseCategory;
        this.label = label;
    }

    public static ExpenseSubCategory findByLabel(String byLabel) {
        for (ExpenseSubCategory r : ExpenseSubCategory.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }
}