package me.yukyeong.demo.Service;

import me.yukyeong.demo.dto.Test;
import me.yukyeong.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

   @Autowired
   TestMapper testMapper;

    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }
}
