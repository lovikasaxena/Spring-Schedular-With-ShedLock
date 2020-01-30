package com.lovikasaxena.shedlock.mongo

import com.mongodb.MongoClient
import net.javacrumbs.shedlock.core.LockProvider
import net.javacrumbs.shedlock.provider.mongo.MongoLockProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MongoConfig {

    @Bean
    fun lockProvider(mongo: MongoClient): LockProvider? {
        return MongoLockProvider(mongo, "my-database")
    }
}