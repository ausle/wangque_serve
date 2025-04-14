package com.asule.wangque.controller;

import com.asule.wangque.common.Result;
import com.asule.wangque.entity.Magazine;
import com.asule.wangque.service.IntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/magazine")
public class IntoController {

    @Autowired
    private IntoService intoService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Result upload(@RequestBody Magazine magazine) {
        Long id = magazine.getId();
        Magazine returnM = intoService.listAll(id);
        return Result.success(returnM);
    }

}
