package com.main.learn.threads.concurrencyPractice.chapter6;

import java.util.concurrent.Callable;

public class QuoteTask implements Callable<TravelQuote> {
    private final TravelCompany company;

    private final TravelInfo travelInfo;

    public QuoteTask(TravelCompany company, TravelInfo travelInfo) {
        this.company = company;
        this.travelInfo = travelInfo;
    }

    @Override
    public TravelQuote call() throws Exception {
        return company.solicitQuote(travelInfo);
    }

    private class TravelCompany {
        TravelInfo solicitQuote(TravelInfo travelInfo) {
            return new TravelInfo();
        }
    }

    private class TravelInfo extends TravelQuote {
    }
}
