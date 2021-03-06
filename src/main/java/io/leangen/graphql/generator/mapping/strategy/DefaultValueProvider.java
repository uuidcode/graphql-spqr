package io.leangen.graphql.generator.mapping.strategy;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Parameter;

import io.leangen.graphql.metadata.OperationArgumentDefaultValue;

/**
 * @author Bojan Tomic (kaqqao)
 */
public interface DefaultValueProvider {
    
    OperationArgumentDefaultValue getDefaultValue(Parameter parameter, AnnotatedType parameterType, OperationArgumentDefaultValue initialValue);
}
