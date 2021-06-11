package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations;

import com.tngtech.jgiven.integration.spring.EnableJGiven;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableJGiven
@ComponentScan(basePackages = {"com.example.springjgivenseleniumsuite.springjgivenseleniumsuite"})
public class SimpleTestContext {}
