package cn.lollipopzzz.pichostingproxy.controller;

import cn.lollipopzzz.pichostingproxy.service.PicHostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PicHostingController {

    @Autowired
    PicHostingService picHostingService;

    @PostMapping("/upload-pic")
    public void uploadPicture() {

    }

    @GetMapping("/download-pic")
    public void downloadPicture() {

    }
}
