package com.ktorDocker

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.html.*
import kotlinx.html.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.DevelopmentEngine.main(args)

fun Application.main() {
	routing {


		get("/html-dsl") {
			call.respondHtml {

				head {
					title( "Ktor:Jetty")
				}
				body {
					h1 { +"Welcome to Docker with Ktor" }
					ul {
						p {
							+"Welcome to My Docker Blog using Ktor Framework"
						}
					}
				}
			}
		}
	}

}

