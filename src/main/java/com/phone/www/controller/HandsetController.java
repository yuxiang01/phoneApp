package com.phone.www.controller;

import com.phone.www.service.HandsetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class HandsetController {
  @Resource
  HandsetService handsetService;

  @GetMapping("/")
  public String indexPage() {
    return "index";
  }
}
