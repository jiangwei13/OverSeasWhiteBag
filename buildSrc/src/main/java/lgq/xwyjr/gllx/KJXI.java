package lgq.xwyjr.gllx;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;

public class KJXI implements IKeyGenerator {

    @Override
    public byte[] generate(String value) {
        String currentKey = System.currentTimeMillis() + "";
        return currentKey.getBytes(StandardCharsets.UTF_8);
    }
}
