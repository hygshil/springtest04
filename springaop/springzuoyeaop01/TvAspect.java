package springzuoyeaop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TvAspect {
    public void insertTv(){
        System.out.println("插播广告...");
    }
    public void vipTv(){
        System.out.println("亲，办理会员可以看vip...");
    }

    public void roundTv(ProceedingJoinPoint pj){
        //我是上面的
        System.out.println("请先验证");
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面的
        System.out.println("转账成功");
    }

    public void sendTvError(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他类型的视频");
    }

    //最终通知
    public void finalTv(){
        System.out.println("给管理员发送了异常通知");
    }
}
