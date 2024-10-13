package dev.pdmnhn.patterns.decorator.inputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int bytesRead = in.read(b, offset, len);
        for (int i = offset; i < offset + bytesRead; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return bytesRead;
    }
}
