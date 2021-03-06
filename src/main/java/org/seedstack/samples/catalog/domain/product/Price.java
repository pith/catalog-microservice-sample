package org.seedstack.samples.catalog.domain.product;

import org.seedstack.business.api.domain.BaseValueObject;

import javax.persistence.Embeddable;

/**
 * A price value object.
 *
 * @author pierre.thirouin@ext.mpsa.com (Pierre Thirouin)
 */
@Embeddable
public class Price extends BaseValueObject {

    private float amount;

    private String currency;

    Price() {
    }

    /**
     * Constructor.
     *
     * @param amount   the amount
     * @param currency the currency
     */
    public Price(float amount, String currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("The price amount can't be negative: " + amount);
        }
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
