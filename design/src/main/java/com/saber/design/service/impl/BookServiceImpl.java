package com.saber.design.service.impl;

import com.saber.design.pojo.Book;
import com.saber.design.mapper.BookMapper;
import com.saber.design.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书 服务实现类
 * </p>
 *
 * @author caochenlei
 * @since 2022-11-25
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
