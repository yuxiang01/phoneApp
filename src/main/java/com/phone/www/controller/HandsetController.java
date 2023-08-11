package com.phone.www.controller;

import com.phone.www.entity.Handset;
import com.phone.www.service.HandsetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HandsetController {
    @Resource
    HandsetService handsetService;

    @GetMapping("/")
    public String indexPage() {
        return "select";
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

    @GetMapping("/list")
    @ResponseBody
    public List<Handset> list() {
        return handsetService.list();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, HttpServletRequest request) {
        String msg = handsetService.removeById(id) ? "删除成功" : "删除失败";
        request.getSession().setAttribute("msg", msg);
        return "redirect:result.html";
    }
}
