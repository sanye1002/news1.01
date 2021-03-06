package cn.popo.news.core.utils;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;



/**
 * @Author: 八哥
 * @computer：Administrator
 * @create 2018-03-16 下午 3:39
 * @description: 单文件与多文件的上传
 */
@Slf4j
public class UploadUtil {
    public static List<String> uploadFiles(MultipartFile[] file, String path, String type) {

        File dir = new File(path);
        //判断目录是否存在
        if (!dir.exists()) {
            // 如果不存在，自动创建
            dir.mkdirs();

        }
        List<String> srcList = new ArrayList<>();
        //遍历文件数组,上传
        for (int i = 0; i < file.length; i++) {
            if (file[i] != null) {
                //调用上传 判断
                //得到集合
                if (uploadFile(file[i], path, type) != null) {
                    srcList.add(uploadFile(file[i], path, type));
                }

            }

        }
        return srcList;


    }

    public static String uploadFile(MultipartFile file, String path, String type) {
        File dir = new File(path);
        //判断目录是否存在
        log.info("【文件上传】 path={}", path);
        log.info("【文件上传】 dir.exists()={}", dir.exists());
        //判断目录是否存在
        if (!dir.exists()) {
            // 如果不存在，自动创建
            dir.mkdirs();
        }
        //上传文件名
        //String fileName = KeyUtil.genUniqueKey() + file.getOriginalFilename();
        String fileName = KeyUtil.genUniqueKey() + ".jpg";
        //保存文件
        File saveFile = new File(path + File.separator + fileName);

        try {
            file.transferTo(saveFile);
            log.info("fileName={}", fileName);
            return "/read/img/" + type + "/" + fileName;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }


}
