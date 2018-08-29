package com.smartTelco.zuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.smartTelco.zuulgateway.filters.ErrorFilter;
import com.smartTelco.zuulgateway.filters.PostFilter;
import com.smartTelco.zuulgateway.filters.PreFilter;
import com.smartTelco.zuulgateway.filters.RouteFilter;
/**
 * ZUUL - API Gateway for routing.
 * 
 * @author jaymani
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZullApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullApiGatewayApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
