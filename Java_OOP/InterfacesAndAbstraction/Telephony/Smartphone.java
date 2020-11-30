package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        urls.forEach(url -> sb.append(checkUrl(url)).append(System.lineSeparator()));
        return sb.toString().trim();
    }

    private String checkUrl(String url) {
        if (!url.matches("^[^0-9]+$")){
            return "Invalid URL!";
        }
        return "Browsing: " + url;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        numbers.forEach(number -> sb.append(checkNumbers(number)).append(System.lineSeparator()));
        return sb.toString().trim();
    }

    private String checkNumbers(String number) {
        if (number.matches("^[^0-9]+$")){
            return "Invalid number!";
        }
        return "Calling... " + number;
    }

}
