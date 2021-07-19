package com.buit.config;

import com.buit.properties.MultipleDataSourceProperties;
import com.buit.properties.MyDataSourceProperties;
import com.mysql.cj.jdbc.MysqlXADataSource;
import oracle.jdbc.xa.client.OracleXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@MapperScan(basePackages = "com.buit.mdi.**.dao",sqlSessionTemplateRef = "mdiSqlSessionTemplate")
public class MdiDataSourceConfig {

    @Autowired
    MultipleDataSourceProperties multipleProperties;

    @Bean("mdiDataSource")
    public DataSource mdiDataSource() throws SQLException {
        MyDataSourceProperties proper = multipleProperties.getMultiple().get("mdi");
        if(proper.getUrl().contains("jdbc:oracle")){
            MyDataSourceProperties mdiProperties = multipleProperties.getMultiple().get("mdi");
            OracleXADataSource xaDataSource = new OracleXADataSource();
            xaDataSource.setURL(mdiProperties.getUrl());
            xaDataSource.setPassword(mdiProperties.getPassword());
            xaDataSource.setUser(mdiProperties.getUsername());
            AtomikosDataSourceBean atomXaDatasource = new AtomikosDataSourceBean();
            atomXaDatasource.setXaDataSource(xaDataSource);
            atomXaDatasource.setUniqueResourceName(mdiProperties.getUniqueResourceName());
            atomXaDatasource.setMinPoolSize(mdiProperties.getMinPoolSize());
            atomXaDatasource.setMaxPoolSize(mdiProperties.getMaxPoolSize());
            atomXaDatasource.setMaxLifetime(mdiProperties.getMaxLifetime());
            atomXaDatasource.setBorrowConnectionTimeout(mdiProperties.getBorrowConnectionTimeout());
            atomXaDatasource.setLoginTimeout(mdiProperties.getLoginTimeout());
            atomXaDatasource.setMaintenanceInterval(mdiProperties.getMaintenanceInterval());
            atomXaDatasource.setMaxIdleTime(mdiProperties.getMaxIdleTime());
            atomXaDatasource.setTestQuery(mdiProperties.getTestQuery());
            return atomXaDatasource;
        }else{
            MyDataSourceProperties mdiProperties = multipleProperties.getMultiple().get("his");
            MysqlXADataSource xaDataSource = new MysqlXADataSource();
            xaDataSource.setURL(mdiProperties.getUrl());
            xaDataSource.setPassword(mdiProperties.getPassword());
            xaDataSource.setUser(mdiProperties.getUsername());
            AtomikosDataSourceBean atomXaDatasource = new AtomikosDataSourceBean();
            atomXaDatasource.setXaDataSource(xaDataSource);
            atomXaDatasource.setUniqueResourceName("mdiDataSource");
            atomXaDatasource.setMinPoolSize(mdiProperties.getMinPoolSize());
            atomXaDatasource.setMaxPoolSize(mdiProperties.getMaxPoolSize());
            atomXaDatasource.setMaxLifetime(mdiProperties.getMaxLifetime());
            atomXaDatasource.setBorrowConnectionTimeout(mdiProperties.getBorrowConnectionTimeout());
            atomXaDatasource.setLoginTimeout(mdiProperties.getLoginTimeout());
            atomXaDatasource.setMaintenanceInterval(mdiProperties.getMaintenanceInterval());
            atomXaDatasource.setMaxIdleTime(mdiProperties.getMaxIdleTime());
            atomXaDatasource.setTestQuery(mdiProperties.getTestQuery());
            return atomXaDatasource;
        }
    }

    @Bean("mdiJdbcTemplate")
    public JdbcTemplate mdiJdbcTemplate(@Qualifier("mdiDataSource") DataSource mdiDataSource){
        return new JdbcTemplate(mdiDataSource);
    }

    @Bean("mdiSqlSessionFactory")
    public SqlSessionFactory mdiSqlSessionFactory(@Qualifier("mdiDataSource")DataSource mdiDataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFacttory = new SqlSessionFactoryBean();
        sqlSessionFacttory.setDataSource(mdiDataSource);
        sqlSessionFacttory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/buit/mdi/**/*.xml"));
        return sqlSessionFacttory.getObject();
    }

    @Bean("mdiSqlSessionTemplate")
    public SqlSessionTemplate mdiSqlSessionTemplate(@Qualifier("mdiSqlSessionFactory")SqlSessionFactory mdiSqlSessionFactory){
        return new SqlSessionTemplate(mdiSqlSessionFactory);
    }
}
