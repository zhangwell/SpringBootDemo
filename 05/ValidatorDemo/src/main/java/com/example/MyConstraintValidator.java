package com.example;

import com.example.demo.MyConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * 在自定义验证实现类中需要两个万法（ initialize 和 isValid ）一 切始化验证消息的方法和执行验证的方法。
 **/
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, String> {
    // String为校验的类型
    // 在初始化验证 肖患的万法中，可以得到配置的注解内容；
    @Override
    public void initialize(MyConstraint myConstraint) {
        //启动时执行
    }

    /**
     * @Description: 自定义校验逻辑
     * 验证方法则是用来验证业务逻辑的，它需要继承 ConstraintValidator 接口
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext validatorContext) {
        if (!(s.equals("北京") || s.equals("上海"))) {
            return false;
        }
        return true;
    }
}
