package com.accp.controller.kl;

import com.accp.domain.Priabill;
import com.accp.domain.Priadetails;
import com.accp.service.kl.referpriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/referpria")
public class referpriaController {
   @Autowired
    referpriaService referpriaService;
    //新增取用预付款
    @PostMapping("/insert")
    public boolean insert(Priabill Priabill){
        return referpriaService.insert(Priabill);
    }
    //修改取用预付款
    @PostMapping("/update")
    public boolean update(Priabill Priabill){
        return referpriaService.update(Priabill);
    }
}
