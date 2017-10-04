package com.zeroscala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan


object ZeroScala extends App {
//  SpringApplication.run(ZeroScala.getClass, args: _*)
  SpringApplication.run(classOf[BootConfig])
}
