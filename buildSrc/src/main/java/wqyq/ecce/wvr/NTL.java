package wqyq.ecce.wvr;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;

public class NTL implements IKeyGenerator {

    @Override
    public byte[] generate(String value) {
        String currentKey = System.currentTimeMillis() + "";
        return currentKey.getBytes(StandardCharsets.UTF_8);
    }
}
