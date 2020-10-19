package com.fan.share.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.share.entity.item.Book;
import org.springframework.stereotype.Repository;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/10/7 13:18
 */
@Repository
public interface BookDao extends BaseMapper<Book> {
}
