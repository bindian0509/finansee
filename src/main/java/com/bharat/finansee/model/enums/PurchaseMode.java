package com.bharat.finansee.model.enums;

/**
 * @author Bharat Verma  on Sun, 01-Apr-2018
 */
public enum PurchaseMode {

    ONLINE(1, "ONLINE"),
    OFFLINE(2, "OFFLINE");

    private String label;
    private int id;

    PurchaseMode(int id , String label) {
        this.id = id;
        this.label = label;
    }


    public static PurchaseMode getById (int value) {

        switch (value) {
            case 1:
                return ONLINE;
            case 2:
                return OFFLINE;
            default:
                throw new IllegalArgumentException("Purchase Mode");
        }

    }

    public static PurchaseMode findByLabel(String byLabel) {
        for(PurchaseMode r:PurchaseMode.values()) {
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
