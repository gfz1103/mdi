package com.buit.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description
 * @Author yueyu
 * @Date 2021/1/19 14:33
 */
@Component("multipleDataSource")
@ConfigurationProperties(prefix = "spring.datasource")
public class MultipleDataSourceProperties {

    private Map<String, MyDataSourceProperties> multiple;

    public Map<String, MyDataSourceProperties> getMultiple() {
        return multiple;
    }

    public void setMultiple(Map<String, MyDataSourceProperties> multiple) {
        this.multiple = multiple;
    }
}
