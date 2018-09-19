package com.extend;

import org.junit.Test;
import org.springframework.util.Assert;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

public class ZFileTest {
    @Test
    public  void File()
    {
        ZFile.WriteText("D:\\tmp\\tmp.tmp","this is my test");
        byte[] b=ZFile.ReadFile("D:\\tmp\\tmp.tmp");
        String str=new String(b);
        Assert.notNull(str,"error");
    }
}