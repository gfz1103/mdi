package com.buit.config;

import com.buit.properties.MultipleDataSourceProperties;
import com.buit.properties.MyDataSourceProperties;
import com.mysql.cj.jdbc.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Description
 * @Author yueyu
 * @Date 2021/1/19 10:33
 */
@Configuration
@MapperScan(basePackages = {"com.buit.his.**.dao","com.buit.mq.**.dao"},sqlSessionTemplateRef = "hisSqlSessionTemplate")
public class HisDataSourceConfig {


    @Autowired
    MultipleDataSourceProperties multipleProperties;


    @Primary
    @Bean("hisDataSource")
    public DataSource hisDataSource() throws SQLException {
        MyDataSourceProperties hisProperties = multipleProperties.getMultiple().get("his");
        MysqlXADataSource xaDataSource = new MysqlXADataSource();
        xaDataSource.setURL(hisProperties.getUrl());
        xaDataSource.setPinGlobalTxToPhysicalConnection(true);
        xaDataSource.setPassword(hisProperties.getPassword());
        xaDataSource.setUser(hisProperties.getUsername());
        AtomikosDataSourceBean atomXaDatasource = new AtomikosDataSourceBean();
        atomXaDatasource.setXaDataSource(xaDataSource);
        atomXaDatasource.setUniqueResourceName(hisProperties.getUniqueResourceName());
        atomXaDatasource.setMinPoolSize(hisProperties.getMinPoolSize());
        atomXaDatasource.setMaxPoolSize(hisProperties.getMaxPoolSize());
        atomXaDatasource.setMaxLifetime(hisProperties.getMaxLifetime());
        atomXaDatasource.setBorrowConnectionTimeout(hisProperties.getBorrowConnectionTimeout());
        atomXaDatasource.setLoginTimeout(hisProperties.getLoginTimeout());
        atomXaDatasource.setMaintenanceInterval(hisProperties.getMaintenanceInterval());
        atomXaDatasource.setMaxIdleTime(hisProperties.getMaxIdleTime());
        atomXaDatasource.setTestQuery(hisProperties.getTestQuery());

        return atomXaDatasource;
    }

    @Primary
    @Bean("hisJdbcTemplate")
    public JdbcTemplate hisJdbcTemplate(@Qualifier("hisDataSource") DataSource hisDataSource){
        return new JdbcTemplate(hisDataSource);
    }

    @Primary
    @Bean("hisSqlSessionFactory")
    public SqlSessionFactory hisSqlSessionFactory(@Qualifier("hisDataSource")DataSource hisDataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFacttory = new SqlSessionFactoryBean();
        sqlSessionFacttory.setDataSource(hisDataSource);
        sqlSessionFacttory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/buit/his/**/*.xml"));
        return sqlSessionFacttory.getObject();
    }

    @Primary
    @Bean("hisSqlSessionTemplate")
    public SqlSessionTemplate hisSqlSessionTemplate(@Qualifier("hisSqlSessionFactory")SqlSessionFactory hisSqlSessionFactory){
        return new SqlSessionTemplate(hisSqlSessionFactory);
    }
}
