package com.phone.www.controller;

import com.phone.www.entity.Handset;
import com.phone.www.service.HandsetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HandsetController {
  @Resource
  HandsetService handsetService;

  @GetMapping("/")
  public String indexPage() {
    return "index";
  }

  @GetMapping("/update/{id}")
  public String updatePage(@PathVariable Integer id, HttpServletRequest request) {
    request.setAttribute("phone", handsetService.query().eq("hsId", id).one());
    return "update";
  }

  @GetMapping("/result.html")
  public String toResultPage() {
    return "result";
  }

  @PostMapping("/update")
  public String update(Handset handset, HttpServletRequest request) {
    String msg = handsetService.updateById(handset) ? "修改成功" : "修改失败";
    request.getSession().setAttribute("msg", msg);
    return "redirect:result.html";
  }
}
