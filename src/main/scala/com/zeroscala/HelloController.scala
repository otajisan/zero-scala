package com.zeroscala

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/hello"))
class HelloController @Autowired()(private val helloService: HelloService) {
  @RequestMapping(method = Array(RequestMethod.GET))
  def data = helloService.getHello
}

