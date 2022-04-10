package com.bharat.finansee.model;

/**
 * @author : bharat.verma
 * @created : 10/04/22, Sunday
 **/
public class PersonV2 {
    private Name name;

    public PersonV2() {
        super();
    }

    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}
