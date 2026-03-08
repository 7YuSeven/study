package com.javawebpro.controller;

import com.aliyuncs.exceptions.ClientException;
import com.javawebpro.pojo.Result;
import com.javawebpro.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {

    @Autowired
    AliOSSUtils aliOSSUtils;

//    @PostMapping("/upload")
//    public Result upload(String name, Integer age, MultipartFile file) throws IOException {
//        log.info("接收到的数据为" + name + ", " + age + ", " + file);
//        //获取文件名
//        String filename = file.getOriginalFilename();
//        //获取最后一个.的索引
//        int index = filename.lastIndexOf(".");
//        //获取随机数UUID并和文件后缀拼接形成新的文件名
//        String newFilename = UUID.randomUUID().toString() + filename.substring(index);
//        //输出新文件名
//        log.info(newFilename);
//        //将文件存储在本地
//        file.transferTo(new File("D:\\Codes\\" + newFilename));
//
//        return Result.success();
//    }

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException, ClientException {
        log.info("文件上传：" + image.getOriginalFilename());
        //调用阿里云oss工具类
        String url = aliOSSUtils.upload(image);
        log.info("图片的url为" + url);



        return Result.success(url);
    }
}
