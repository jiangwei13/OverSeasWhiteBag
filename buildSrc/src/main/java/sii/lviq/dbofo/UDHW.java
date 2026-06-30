package sii.lviq.dbofo;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;

public class UDHW implements IKeyGenerator {

    @Override
    public byte[] generate(String value) {
        String currentKey = System.currentTimeMillis() + "";
        return currentKey.getBytes(StandardCharsets.UTF_8);
    }
}
