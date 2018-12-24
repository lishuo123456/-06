package com.baizhi;

import com.baizhi.entity.Poetries;
import com.baizhi.service.PoetriesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBranch {
    @Autowired
    private PoetriesService poetriesService;

    @Test
    public void contextLoads() {
        System.out.println("1234");
    }


}

