package com.example.demo.helper.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangxin
 * @version v1.0
 * @date 2022/8/23
 * @work 区分应用注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pattern {

    String value() default "ADMIN";

}