package org.mpei.ClassWork_18.validate;

import org.mpei.ClassWork_18.Order;
import org.mpei.ClassWork_9.Bean;

@Bean
public class NotNullFieldsValidation implements OrderValidation {
    @Override
    public boolean check(Order o) {
        if (o.getItems() == null || o.getItems().isEmpty()) {
            return false;
        }
        if (o.getSum() == null || o.getSum() <= 0) {
            return false;
        }
        return true;
    }
}
