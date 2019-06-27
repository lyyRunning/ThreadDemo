package com.function.luo.threaddemo;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;

/**
 * Created by luo on 2019/6/27.
 *
 */

public class TheadPoolUtils {


    /**
     * FixedThreadPool线程池
     * @return
     */
    public static ExecutorService getFixedThreadPool(){
        ExecutorService executorService = null;
        if (executorService==null){
            executorService = newFixedThreadPool(8);
        }


        return executorService;
    }




    /**
     * CachedThreadPool线程池
     * @return
     */
    public static ExecutorService getCashedThreadPool(){
        ExecutorService executorService = null;
        if (executorService==null){
            executorService = newCachedThreadPool();
        }


        return executorService;
    }

    /**
     * newScheduledThreadPool线程池
     * @return
     */
    public static ExecutorService getScheduledThreadPool(){
        ExecutorService executorService = null;
        if (executorService==null){
            executorService = newScheduledThreadPool(8);
        }


        return executorService;
    }
    /**
     * ScheduledThreadPool线程池
     * @return
     */
    public static ExecutorService getSingleThread(){
        ExecutorService executorService = null;
        if (executorService==null){
            executorService = newSingleThreadScheduledExecutor();
        }


        return executorService;
    }
}
