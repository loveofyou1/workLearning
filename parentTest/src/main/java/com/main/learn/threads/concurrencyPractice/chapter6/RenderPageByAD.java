package com.main.learn.threads.concurrencyPractice.chapter6;

//import sun.jvm.hotspot.debugger.Page;

public class RenderPageByAD {
/*
    private static final int TIME_BUDGET = 10;

    private ExecutorService exec = Executors.newFixedThreadPool(10);

    Page renderPageWithAd() throws InterruptedException {
        long endNanos = System.nanoTime() + TIME_BUDGET;

        Future<Ad> f = (Future<Ad>) exec.submit(new FetchTask());
        Page page = renderpageBody();

        Ad ad;

        try {
            long timeleft = endNanos - System.nanoTime();
            ad = f.get(timeleft, TimeUnit.NANOSECONDS);
        } catch (ExecutionException e) {
            ad = new Ad();
        } catch (TimeoutException e) {
            ad = new Ad();
            f.cancel(true);
        }
        //page = page.setAd(ad);
        return page;

    }

    private Page renderpageBody() {
        return new Page(1, 1);
    }


    private class FetchTask implements Runnable {
        @Override
        public void run() {
            System.out.println("fetch task");
        }
    }*/
}
