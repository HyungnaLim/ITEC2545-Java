package topic11;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.doubleInput;

public class ExchangeRateConverter {

    public static void main(String[] args) {
        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        // everything after the ? in the url are query parameters
        // create hashmap for parameters that are key-value object structure
        Map<String, Object> queryParameters = Map.of("base", "USD", "symbols", "EUR");

        // request unirest to convert the json response into java object
        RateResponse response = Unirest.get(url)
                .queryString(queryParameters)
                .asObject(RateResponse.class)
                .getBody();

        String base = response.base;
        String dateRequested = response.date;
        double rate = response.rates.EUR;

        double amountOfDollars = doubleInput("How many US Dollars to convert to Euros?");
        double euroEquivalent = amountOfDollars * rate;

        System.out.println("On " + dateRequested + " the exchange rate from " + base + " to EUR is " + rate);
        System.out.println("$" + amountOfDollars + " is equivalent to " + euroEquivalent + " Euros.");

    }
}


class RateResponse {
    public String base;
    public String date;
    public Rates rates; // nested object
}


class Rates {
    public double EUR;

}