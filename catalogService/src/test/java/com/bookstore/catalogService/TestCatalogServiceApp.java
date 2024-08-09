package com.bookstore.catalogService;

import org.springframework.boot.SpringApplication;

public class TestCatalogServiceApp {

    public static void main(String[] args) {
        SpringApplication.from(CatalogServiceApp::main)
                .with(ContainerConfig.class)
                .run(args);
    }
}
