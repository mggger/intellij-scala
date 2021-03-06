package org.jetbrains.plugins.scala.util.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface RunWithJdkVersions {

    /** unsupported JDK for scala SDK are filtered out in
     * {@link ScalaVersionAwareTestsCollector#collectTests()}*/
    TestJdkVersion[] value() default {};
    TestJdkVersion[] extra() default {};
}
