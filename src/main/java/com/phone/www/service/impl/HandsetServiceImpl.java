package com.phone.www.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phone.www.entity.Handset;
import com.phone.www.mapper.HandsetMapper;
import com.phone.www.service.HandsetService;
import org.springframework.stereotype.Service;

@Service
public class HandsetServiceImpl
    extends ServiceImpl<HandsetMapper, Handset>
    implements HandsetService {
}
