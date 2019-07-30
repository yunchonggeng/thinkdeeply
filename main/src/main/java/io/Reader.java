package io;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        byteArrayInputStream();
    }

    public static void printlnmothed() throws IOException {
        char c;
        int read;
        byte input[]=new byte[1];
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in),2);
        System.out.println("输入字符, 按下 'q' 键退出。");
//        while(br.read()==-1) {
//            c = (char) br.read();
//            read =  br.read();
//            System.out.println(read);
//        }
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());System.out.println(br.readLine());
        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
    }

    public static void byteArrayInputStream() throws IOException {
        byte input[]=new byte[2];
        InputStream in = new ByteArrayInputStream(input);
//        while(in.read()==-1){
//            System.out.println(b);
//        }
//        System.out.println(b);
            int b=in.read();
            if(b==-1){
                System.out.println(b+"++"+input.length);
            }
            System.out.println(b+"++"+input.length);
            b=in.read();
            System.out.println(b+""+input.length);
            b=in.read();
            System.out.println(b+"++"+input.length);



    }
}
