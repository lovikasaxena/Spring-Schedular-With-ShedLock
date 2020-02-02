package com.lovikasaxena.shedlock.schedular

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class FirstSchedular {

    private val log = LoggerFactory.getLogger(FirstSchedular::class.java)

    @Scheduled(cron = "0 0 */1 ? * *")    /* Schedule this task everyday at 9am */
    @SchedulerLock(name = "scheduledTaskName", lockAtMostFor = "30m", lockAtLeastFor = "20m")
    fun schedule(){
        log.info("Running the scheduled task: $i++, using thread: ${Thread.currentThread().name}")
    }

    companion object {
        val i = 0
    }
}