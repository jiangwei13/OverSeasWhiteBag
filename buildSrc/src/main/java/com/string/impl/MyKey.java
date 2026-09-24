package com.string.impl;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;
import java.util.Random;


public class MyKey implements IKeyGenerator {

    @Override
    public byte[] generate(String value) {
        // value是待加密字符串，这里返回加密的密钥。
        // 示例表示使用"Hello World"作为密钥，这里可以根据不同的字符串使用不同的密钥。
        long currentTime = System.currentTimeMillis();
        Random random = new Random();
        int num = random.nextInt(100);// 生成 0~99 的整数
        currentTime += num;
        String currentKey = String.valueOf(currentTime);
        return currentKey.getBytes(StandardCharsets.UTF_8);
    }

}
