package com.function.luo.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * Created by luo on 2019/7/2.
 *
 * 静态内部类，封装第三方（建议使用此种方式）
 */

public class ExecutorServiceCreator {

    /**
     * 私有构造
     */
    private ExecutorServiceCreator() {
    }



    /**
     * 静态内部类
     */
    private  static  class FixedHolder{
        private static  final ExecutorService fixedExecutorService = newFixedThreadPool(8);
    }

    /**
     * FixedThreadPool线程池
     * @return
     */
    public static ExecutorService getFixedInstance(){
        return FixedHolder.fixedExecutorService;
    }


    /**
     * 静态内部类
     */
    private  static  class CachedHolder{
        private static  final ExecutorService cachedExecutorService = newCachedThreadPool();
    }

    /**
     * CachedThreadPool线程池
     * @return
     */
    public static ExecutorService getCachedInstance(){
        return CachedHolder.cachedExecutorService;
    }


    /**
     * 静态内部类
     */
    private  static  class ScheduledHolder{
        private static  final ExecutorService scheduledExecutorService = newCachedThreadPool();
    }

    /**
     * CachedThreadPool线程池
     * @return
     */
    public static ExecutorService getScheduledInstance(){
        return ScheduledHolder.scheduledExecutorService;
    }



    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final ExecutorService singletonExecutorService = (ExecutorService) newCachedThreadPool();


    }



    /**
     * CachedThreadPool线程池
     * @return
     */
    public static ExecutorService getSingleInstance() {
        return SingletonHolder.singletonExecutorService;
    }


}
