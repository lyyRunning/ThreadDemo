package com.function.luo.threaddemo;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;

/**
 * Created by luo on 2019/6/27.
 * 懒汉式封装（也可以，效率不高）
 */

public class TheadPoolUtils {
    private TheadPoolUtils() {
    }

    static ExecutorService fixedxecutorService = null;
    static ExecutorService cachedExecutorService = null;
    static ExecutorService scheduledExecutorService = null;
    static ExecutorService singleExecutorService = null;


    /**
     * FixedThreadPool线程池
     * @return
     */
    public static synchronized ExecutorService getFixedThreadPool(){

        if (fixedxecutorService==null){
            fixedxecutorService = newFixedThreadPool(8);
        }

        return fixedxecutorService;
    }




    /**
     * CachedThreadPool线程池
     * @return
     */
    public static synchronized ExecutorService getCachedThreadPool(){

        if (cachedExecutorService==null){
            cachedExecutorService = newCachedThreadPool();

        }

        return cachedExecutorService;
    }

    /**
     * newScheduledThreadPool线程池
     * @return
     */
    public static synchronized ExecutorService getScheduledThreadPool(){
        if (scheduledExecutorService==null){
            scheduledExecutorService = newScheduledThreadPool(8);
        }


        return scheduledExecutorService;
    }
    /**
     * ScheduledThreadPool线程池
     * @return
     */
    public static synchronized ExecutorService getSingleThread(){

        if (singleExecutorService==null){
            singleExecutorService = newSingleThreadScheduledExecutor();
        }


        return singleExecutorService;
    }





}
