package com.zeroscala

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@EnableAutoConfiguration
@RestController
@RequestMapping(Array("/hello"))
class HelloController @Autowired()(private val helloService: HelloService) {
  @RequestMapping(method = Array(RequestMethod.GET))
  def data = helloService.getHello
}

