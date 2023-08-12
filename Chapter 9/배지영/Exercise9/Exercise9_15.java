package Chapter9;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class Exercise9_15 {
    public static void main(String[] args) throws Exception{
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println(joinByteArr(bArr));
        System.out.println(joinByteArr(bArr2));

        System.out.println(new String(bArr, "UTF-8"));
        System.out.println(new String(bArr2, "CP949"));
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":","[","]");

        for(byte b: bArr)
        {
            sj.add(String.format("%02X", b));
        }

        return sj.toString();
    }
}
