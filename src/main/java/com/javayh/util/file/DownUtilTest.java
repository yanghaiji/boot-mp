package com.javayh.util.file;

/**
 * @author Dylan Yang
 * @Title: DownUtilTest
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/1722:08
 */

/**
 * Created by amosli on 14-7-2.
 */
public class DownUtilTest {

    public static void main(String args[]) throws Exception {
        String downloadFilePath = "https://www.baidu.com/s?wd=%E7%A1%AC%E5%BA%A7%E5%BD%93%E5%8D%A7%E9%93%BA%E8%A2%AB%E6%8B%98&ie=utf-8&rsv_cq=java.net.UnknownHostException%3A+C&rsv_dl=0_right_fyb_pchot_20811_01";
        String saveFileDir= "D:/Download/";

        HttpMulitThreadDownload httpMulitThreadDownload = new HttpMulitThreadDownload(2, downloadFilePath, saveFileDir, "2018-2019学习计划安排表.xlsx");
        httpMulitThreadDownload.MulitThreadDownload();
    }
       /* final DownUtil downUtil = new DownUtil("http://C:/Users/yanghaiji/Desktop/2018-2019学习计划安排表.xlsx", "D:/2018-2019学习计划安排表.xlsx", 3);

        downUtil.download();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(downUtil.getCompleteRate()<1){
                    System.out.println("已完成:"+downUtil.getCompleteRate());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }*/

}

