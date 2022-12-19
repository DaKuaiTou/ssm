package com.dkt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author: dkt
 * @Pcakage: com.dkt.aspect.MyAspect
 * @Date: 2022年12月08日 23:15
 * @Description:
 */
@Component
public class MyAspect {

    /*
    *   在切入点执行之前，进行权限校验,前置通知
    * */
    public void checkPermission(){
        System.out.println("权限校验");
    }
    /*
    *   在切入点执行之后，获取方法的返回值，并且进行日志打印，后置通知
    * */
    public void printResult(String resultValue){
        System.out.println("返回值的信息是：" + resultValue);
    }
    /*
    *   在方法执行过程中，捕获异常信息，写入到本地控制台，打印出来，异常通知
    * */
    public void printException(Throwable errorMsg){
        System.out.println("异常信息是：" + errorMsg);
    }
    /*
    *   在方法执行之后，执行资源的回收操作，最终通知
    * */
    public void close(){
        System.out.println("资源回收执行");
    }
    /*
    *   在方法执行结束后，监测方法执行的时间
    * */
    public Object totalTime(ProceedingJoinPoint joinPoint){
        try {
            long startTime = System.currentTimeMillis();
            Object proceed = joinPoint.proceed();
            long endTime = System.currentTimeMillis();
            System.out.println("方法执行结束使用的时间是：" + (endTime-startTime));
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw new RuntimeException();
        }

    }
}
