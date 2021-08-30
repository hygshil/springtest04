package springzuoyeaop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("tvAspect")
@Aspect
public class TvAspect {
    @Pointcut("execution ( * springzuoyeaop02.*.start*(..))")
    public void startpt(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * springzuoyeaop02.*.stop*(..))")
    public void stoppt(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * springzuoyeaop02.*.zhuanMoney*(..))")
    public void zhuanpc(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * springzuoyeaop02.*.findNo*(..))")
    public void findpc(){
        System.out.println("切入点表达式");
    }

    @Before("startpt()")
    public void beforeMsg(){
        System.out.println("插播广告...");
    }

    @AfterReturning("stoppt()")
    public void afterMsg(){
        System.out.println("亲，办理会员可以看vip...");
    }
    @Around("zhuanpc()")
    public void aroundMsg(ProceedingJoinPoint joinPoint){
        System.out.println("请先验证");
        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("转账成功");
    }

    @AfterThrowing(value = "findpc()",throwing = "e")
    public void throwing(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他类型的视频"+e.getMessage());
    }
    @After("findpc()")
    public void afterFinal(){
        System.out.println("给管理员发送了异常通知");
    }
}
