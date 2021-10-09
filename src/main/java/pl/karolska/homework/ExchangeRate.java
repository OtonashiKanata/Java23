package pl.karolska.homework;

import java.math.BigDecimal;

public interface ExchangeRate {

        BigDecimal getBuyingRate(Currency currency);
        BigDecimal getSellingRate(Currency currency);

    }

