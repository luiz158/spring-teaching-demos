package com.example.annotations;
/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link org.springframework.context.annotation.Conditional} annotation that returns true if the current JVM is 
 * not started inside an AWS cloud environment. Useful for beans that should only be created if the application 
 * context is bootstrapped outside the AWS environment (e.g. beans that simulate AWS services for testing)
 *
 * @author Ken Krueger
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnMissingAwsCloudEnvironmentCondition.class)
public @interface ConditionalOnMissingAwsCloudEnvironment {

	//	TODO:  REPLACE AND RETEST WITH @ConditionalOnAwsCloudEnvironment and @ConditionalOnMissingAwsCloudEnvironment

}
