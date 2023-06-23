package com.example.javatest.configuration;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class InventoryMgmtServiceApplicationTests {

    @Autowired private TestEntityManager testEntityManager;
    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
//    @Autowired private ItemRepository itemRepository;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(testEntityManager);
        Assertions.assertNotNull(dataSource);
        Assertions.assertNotNull(jdbcTemplate);
        Assertions.assertNotNull(entityManager);
//        Assertions.assertNotNull(itemRepository);
    }
}
