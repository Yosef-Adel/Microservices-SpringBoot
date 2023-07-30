package com.yosefadel.departmentservice.config;

/*
 * @created 30/07/2023 - 4:39 PM
 * @project service-regisry
 * @author Yosef Adel Mahmoud Saaid
 */

import com.yosefadel.departmentservice.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClintConfig {
    @Autowired
    private LoadBalancedExchangeFilterFunction lbFunction;

    @Bean
    public WebClient employeeWebClint() {
        return  WebClient.builder()
                .baseUrl("http://employee-service")
                .filter(lbFunction)
                .build();

    }

    @Bean
    public EmployeeClient employeeClient() {
        HttpServiceProxyFactory factory =
                HttpServiceProxyFactory
                        .builder(WebClientAdapter.forClient(employeeWebClint()))
                        .build();
        return factory.createClient(EmployeeClient.class);
    }
}
