package com.fan.share.controller.Share;

import com.fan.share.config.MsgResponse;
import com.fan.share.entity.item.Book;
import com.fan.share.entity.item.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/10/7 13:14
 */
@Controller
@RequestMapping("/share")
@ResponseBody
public class ShareController {

    /**
     * 分享书籍
     */
    @RequestMapping("/book")
    public MsgResponse<String> shareBook(@RequestBody Book book){
        //TODO: 从header获取用户信息

        //TODO: 数据插入到数据库

        System.out.println(book);
        return MsgResponse.success("分享成功!");
    }

    /**
     * 分享电影
     */
    @RequestMapping("/movie")
    public MsgResponse<String> shareBook(@RequestBody Movie movie){
        //TODO: 从header获取用户信息

        //TODO: 数据插入到数据库

        System.out.println(movie);
        return MsgResponse.success("分享成功!");
    }

}
