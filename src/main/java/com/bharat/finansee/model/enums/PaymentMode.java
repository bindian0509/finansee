package com.bharat.finansee.model.enums;

/**
 * @author Bharat Verma  on Sun, 01-Apr-2018
 */
public enum PaymentMode {

    CREDIT_CARD(1, "Credit Card"),
    CASH(2, "Cash"),
    DEBIT_CARD(3, "Debit Card"),
    NETBANKING(4, "Netbanking"),
    WALLET(5, "Wallet"),
    CHEQUE(6, "Bank Cheque");

    private String label;
    private int id;

    PaymentMode(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public static PaymentMode getById(int value) {

        switch (value) {

            case 1:
                return CREDIT_CARD;
            case 2:
                return CASH;
            case 3:
                return DEBIT_CARD;
            case 4:
                return NETBANKING;
            case 5:
                return WALLET;
            case 6:
                return CHEQUE;
            default:
                throw new IllegalArgumentException("Payment Mode");
        }

    }

    public static PaymentMode findByLabel(String byLabel) {
        for (PaymentMode r : PaymentMode.values()) {
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
