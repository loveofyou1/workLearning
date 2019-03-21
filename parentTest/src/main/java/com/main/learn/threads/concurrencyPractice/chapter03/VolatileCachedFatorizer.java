package com.main.learn.threads.concurrencyPractice.chapter03;

import com.google.common.collect.Lists;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

/**
 * @author sunlei19
 * @create 2019/3/21
 */
public class VolatileCachedFatorizer implements Servlet {
    private volatile OneValueCache cache = new OneValueCache(null, null);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = extractFromRequest(servletRequest);
        BigInteger[] factors = cache.getFactors(i);
        if (factors == null) {
            factors = factors(i);
            cache = new OneValueCache(i, factors);
        }
        encodeIntoResponse(servletResponse,factors);
    }

    private void encodeIntoResponse( ServletResponse servletResponse, BigInteger[] factors) {
        servletResponse.
    }

    private BigInteger[] factors(BigInteger i) {
        List<BigInteger> list = Lists.newArrayList();
        list.add(i);
        return list.toArray(new BigInteger[0]);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }


    private BigInteger extractFromRequest(ServletRequest request) {
        return BigInteger.valueOf(request.getContentLength());
    }
}
