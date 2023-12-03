package com.violetbeach.hibernateplayground.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class JpaTestContext {
    @Autowired
    protected TestEntityManager em;
}
