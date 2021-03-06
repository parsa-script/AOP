package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {

    //we can cut then method and put our own return things
    @Around("execution(* model.Employee.getName())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Before invoking getName() method");
        Object value = null;
        try {
//            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking getName() method. Return value=" + value);
        return "fuck";
    }

}
