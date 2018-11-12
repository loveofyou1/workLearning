package com.main.lamda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author sunlei19
 * @create 2018/11/12
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader bufferedReader) throws IOException;
}
