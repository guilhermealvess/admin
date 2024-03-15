package com.github.guilhermealvess

import io.micronaut.runtime.Micronaut.run
import org.flywaydb.core.Flyway

fun main(args: Array<String>) {
	val flyway = Flyway.configure()
		.dataSource("jdbc:postgresql://localhost:5432/db", "user", "password")
		.load()

	flyway.migrate()

	run(*args)
}
