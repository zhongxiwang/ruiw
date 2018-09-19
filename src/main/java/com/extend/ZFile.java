package com.extend;


import java.io.*;
import java.net.URI;

public  class  ZFile  {
    /**
     * 读取文件并返回byte[]
     * @param FileName  文件名
     * @return
     */
    public static byte[] ReadFile(String FileName)
    {
        FileInputStream File=null;
            ByteArrayOutputStream bytes=null;
            byte[] arr=null;
            try {
            File=new FileInputStream(FileName);
            bytes=new ByteArrayOutputStream();
            byte[] tmp=new byte[10240];
            int n=0;
            while((n=File.read(tmp))>0)
                bytes.write(tmp,0,n);
            arr= bytes.toByteArray();
            bytes.close();
            File.close();

        } catch (FileNotFoundException e) {
             e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    /**
     * 写入文件流
     * @param Path  文件保存路径
     * @param bytes 需要写入的byte[]
     */
    private static void _WriteFile(String Path,byte[]  bytes,boolean append)
    {
        try {
            FileOutputStream File=new FileOutputStream(Path,append);
            File.write(bytes);
            File.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入文件流
     * @param Path  文件保存路径
     * @param bytes 需要写入的byte[]
     */
    public  static  void WriteFile(String Path,byte[]  bytes)
    {
        _WriteFile(Path,bytes,false);
    }

    /**
     * 写入文本
     * @param Path  文本路径
     * @param Text  正文
     */
    public static void WriteText(String Path,String Text)
    {
        WriteFile(Path,Text.getBytes());
    }

    /**
     *  追加文本
     * @param Path  保存路径
     * @param Text  文本
     */
    public  static  void WriteAppend(String Path,String Text){
        _WriteFile(Path,Text.getBytes(),true);
    }

}
