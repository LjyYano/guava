package com.google.common.yano;

import com.google.common.util.concurrent.RateLimiter;

import junit.framework.TestCase;

/**
 * @author liujiayu03 <liujiayu03@kuaishou.com>
 * Created on 2020-03-04
 */
public class RateLimiterTest extends TestCase {

    public void test() {
        RateLimiter rateLimiter = RateLimiter.create(5);
        rateLimiter.acquire();
        if (rateLimiter.tryAcquire()) {
            // do something
        }
    }

}
