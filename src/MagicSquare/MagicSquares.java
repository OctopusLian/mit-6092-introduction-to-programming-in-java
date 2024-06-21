package MagicSquare;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
    public static boolean checkMagic(String pathName) throws IOException {
        // 打开文件
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        String line;
        while ((line = reader.readLine()) != null) {
            // 行切分
            if (!line.trim().isEmpty()) {
                String[] parts = line.split("\t");
                int sum = 0;
                for (String part : parts) {
                    if (!part.trim().isEmpty()) {
                        sum += Integer.parseInt(part);
                    }
                }

                if (lastSum == -1) {
                    // 记录最近一次计算的sum
                    lastSum = sum;
                } else if (lastSum != sum) {
                    // 如果当前sun和上一次计算的sum值不一样，退出
                    isMagic = false;
                    break;
                }
            }
        }
        // 关闭文件
        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic square ? " + checkMagic(fileName));
        }
    }
}

/**
 * Mercury.txt is magic square ? true
 * Luna.txt is magic square ? true
 */
