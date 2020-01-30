package com.lovikasaxena.shedlock

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "20m")
class SpringSchedularWithShedLock

fun main(args: Array<String>) {
    runApplication<SpringSchedularWithShedLock>(*args)
}
