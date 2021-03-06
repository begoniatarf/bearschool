package gyaku.bearschool.feign.feignconsumer.controller;

import gyaku.bearschool.common.servercommon.domain.JsonResult;
import gyaku.bearschool.feign.feignconsumer.remote.admin.AdminRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {
    @Autowired
    private AdminRemote adminRemote;

    @RequestMapping(value = "/getInfo")
    public JsonResult getInfo(){
        return adminRemote.getInfo();
    }
}
