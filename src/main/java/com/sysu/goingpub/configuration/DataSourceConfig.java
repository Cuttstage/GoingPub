package com.sysu.goingpub.configuration;

import com.sysu.goingpub.configuration.mybatis.interceptor.SqlStatementInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = {"com.sysu.goingpub.dao.*"}, sqlSessionTemplateRef = "goingpubSqlSessionTemplate")
public class DataSourceConfig {

    @Autowired
    SqlStatementInterceptor sqlStatementInterceptor;

    @Bean
    @Primary
    @Qualifier("goingpubDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties goingpubDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "goingpubDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.goingpub.hikari")
    @Primary
    public DataSource tmeDataSource() {
        return goingpubDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "goingpubSqlSessionFactory")
    @Primary
    public SqlSessionFactory goingpubSqlSessionFactory(@Qualifier("goingpubDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);

        //手动设置mybatis的配置
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session
                .Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
//
//        TypeAliasRegistry typeAliasRegistry = configuration.getTypeAliasRegistry();
//        typeAliasRegistry.registerAlias("BLOB", java.sql.Blob.class);
//
//        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
//        typeHandlerRegistry.register(org.apache.ibatis.type.BlobTypeHandler.class);
//
//
        sessionFactoryBean.setConfiguration(configuration);

        //
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/**/*.xml"));
        sessionFactoryBean.setTypeAliasesPackage("com.sysu.goingpub.model");

        // Interceptor[] interceptors = new Interceptor[]{sqlStatementInterceptor};
        // sessionFactoryBean.setPlugins(interceptors);

        return sessionFactoryBean.getObject();
    }

    @Bean(name = "goingpubTransactionManager")
    @Primary
    public DataSourceTransactionManager goingpubTransactionManager(@Qualifier("goingpubDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "goingpubSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate goingpubSqlSessionTemplate(
            @Qualifier("goingpubSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


}
