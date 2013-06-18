package com.adevintheclouds.addresslookup

import org.springframework.context.support.ClassPathXmlApplicationContext

def applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/resources.xml")

applicationContext.registerShutdownHook()
