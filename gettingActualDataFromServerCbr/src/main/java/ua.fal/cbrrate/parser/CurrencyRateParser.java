package ua.fal.cbrrate.parser;

import ua.fal.cbrrate.model.CurrencyRate;

import java.util.List;

public interface CurrencyRateParser {

    List<CurrencyRate> parse(String ratesAsString);
}
