package com.buit.properties;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

/**
 * @Description
 * @Author yueyu
 * @Date 2021/1/19 14:46
 */
public class MyDataSourceProperties extends DataSourceProperties {

    private Integer borrowConnectionTimeout;

    private String uniqueResourceName;

    private Integer loginTimeout;

    private Integer maintenanceInterval;

    private Integer maxIdleTime;

    private Integer maxLifetime;

    private Integer maxPoolSize;

    private Integer minPoolSize;

    private String testQuery;

    public String getTestQuery() {
        return testQuery;
    }

    public void setTestQuery(String testQuery) {
        this.testQuery = testQuery;
    }

    public Integer getBorrowConnectionTimeout() {
        return borrowConnectionTimeout;
    }

    public void setBorrowConnectionTimeout(Integer borrowConnectionTimeout) {
        this.borrowConnectionTimeout = borrowConnectionTimeout;
    }

    public Integer getLoginTimeout() {
        return loginTimeout;
    }

    public void setLoginTimeout(Integer loginTimeout) {
        this.loginTimeout = loginTimeout;
    }

    public Integer getMaintenanceInterval() {
        return maintenanceInterval;
    }

    public void setMaintenanceInterval(Integer maintenanceInterval) {
        this.maintenanceInterval = maintenanceInterval;
    }

    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public Integer getMaxLifetime() {
        return maxLifetime;
    }

    public void setMaxLifetime(Integer maxLifetime) {
        this.maxLifetime = maxLifetime;
    }

    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public Integer getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(Integer minPoolSize) {
        this.minPoolSize = minPoolSize;
    }

    public String getUniqueResourceName() {
        return uniqueResourceName;
    }

    public void setUniqueResourceName(String uniqueResourceName) {
        this.uniqueResourceName = uniqueResourceName;
    }
}
