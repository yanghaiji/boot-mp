package com.javayh.util.file;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/**
 * @author Dylan Yang
 * @Title: FileDown
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/1720:55
 */
public class FileDown {
    /** *
     * 根据文件的起始未知和要读的字节书
     * @param downloadFileName 要下载的文件名
     * @param start 起始位置
     * @param size 要读取的文件大小
     * @param outputStream 文件输出的位置
     *
     */
    public static void download(String downloadFileName,long start,long size,OutputStream outputStream) {
        try{
            //缓冲字节输出流
            BufferedOutputStream out=new BufferedOutputStream(outputStream);
            //注意FILEDIR为文件的根目录
            RandomAccessFile raf=new RandomAccessFile(""+"/"+new String(downloadFileName.getBytes("utf-8")), "r");
            write(start, size, raf, out);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    /** * 将文件写入输出流
     * @param start 文件起始位置（例如:RandomAccessFile.seek(5)是在第六的字节开始读的）
     * @param size 文件的大小 * @param raf 随机输入流
     * @param out 输出流
     */
    private static void write(long start,long size,RandomAccessFile raf,BufferedOutputStream out){
        try {
            byte[] buffer=new byte[1024];
            int byteRead=-1;
            long readLength=0;
            raf.seek(start);
            while(readLength<size-1024){
                byteRead=raf.read(buffer, 0, 1024);
                readLength+=1024;
                out.write(buffer,0,byteRead);
            }
            if (readLength<=size) {
                byteRead=raf.read(buffer, 0, (int)(size-readLength));
                out.write(buffer,0,byteRead);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (raf!=null) {
                    raf.close();
                }
            }catch (IOException ex) {

            }
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException ex) {

            }
        }
    }

}

