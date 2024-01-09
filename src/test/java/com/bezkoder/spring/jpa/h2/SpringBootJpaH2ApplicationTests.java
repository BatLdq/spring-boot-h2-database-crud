package com.bezkoder.spring.jpa.h2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJpaH2ApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootJpaH2ApplicationTests.class);

    @Test
    void contextLoads() {
        // Log de niveau INFO
        logger.info("Le test de contexte a démarré avec succès.");

        // Log de niveau WARNING
        logger.warn("Attention : Ceci est un avertissement.");

        // Log de niveau ERROR
        logger.error("Une erreur est survenue dans le test de contexte.");

        // Log de niveau DEBUG (commenté car il peut être verbeux)
        // logger.debug("Un message de débogage.");
    }
}
