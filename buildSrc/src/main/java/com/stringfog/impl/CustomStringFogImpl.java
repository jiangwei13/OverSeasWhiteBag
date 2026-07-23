package com.stringfog.impl;

import com.github.megatronking.stringfog.IStringFog;

import java.nio.charset.StandardCharsets;

/**
 * StringFog 使用的异或实现。
 */
public class CustomStringFogImpl implements IStringFog {

    @Override
    public byte[] encrypt(String data, byte[] key) {
        return xor(data.getBytes(StandardCharsets.UTF_8), key);
    }

    @Override
    public String decrypt(byte[] data, byte[] key) {
        return new String(xor(data, key), StandardCharsets.UTF_8);
    }

    @Override
    public boolean shouldFog(String data) {
        return true;
    }

    private static byte[] xor(byte[] data, byte[] key) {
        int dataLength = data.length;
        int keyLength = key.length;
        int keyIndex = 0;
        for (int index = 0; index < dataLength; index++) {
            if (keyIndex >= keyLength) {
                keyIndex = 0;
            }
            data[index] = (byte) (data[index] ^ key[keyIndex]);
            keyIndex++;
        }
        return data;
    }
}
