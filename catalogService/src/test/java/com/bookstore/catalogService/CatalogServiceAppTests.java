package com.bookstore.catalogService;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(ContainerConfig.class)
public class CatalogServiceAppTests {
    @Test
    public void contextLoads() {}
}
