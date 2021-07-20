package hellodemo;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static ArrayList<hello> helloList =new ArrayList<hello>();
    public static void main(String[] args) {
        init();
        for (hello book :helloList){
            System.out.println(book);
        }
        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入图书编号");
            int bookId=scan.nextInt();
            hello stockhello= gethelloById(bookId);
            if(stockhello != null) {
                System.out.println("当前编号"+stockhello);
                System.out.println("请输入购买数量：");
                int helloNumber = scan.nextInt();
                if (helloNumber <= stockhello.getNumber()){
                    hello hello=new hello(stockhello.getId(), stockhello.getName(), stockhello.getPrice(), helloNumber, stockhello.getPrice()*helloNumber,stockhello.getPublish() );
                    stockhello.setNumber(stockhello.getNumber() - helloNumber);

                }else{
                    System.out.println("库存不足");
                }

            }else {
                System.out.println("编号输入错误");
            }

        }

    }
    public static void init(){
        hello good1=new hello(101,"狗狗",44.5,100,4450.00,"狗狗大学");
        hello good2=new hello(102,"毛毛虫",99.5,100,9950.00,"毛毛大学");
        helloList.add(good1);
        helloList.add(good2);
    }
    public static hello gethelloById(int helloId) {
        for (hello thishello : helloList) {
            if (thishello.getId() == helloId) {
                return thishello;
            }
        }
        return  null;

    }

    /**
     * 图书的售出信息保存到本地，可通过label标识符判断是否修改文件还是新建文件
     * @param fileName 文件名
     * @param label 文件以存在的标识符。true：以存在的，则内容修改；false：文件不存在，则新建文件
     * @param hello 图书信息
     */
    public static void savehello(String fileName,boolean label,hello hello){
        try{
            BufferedOutputStream out=null;//操作文件输出流
            StringBuffer sbf =new StringBuffer();//记录文件中要存在的数据
            //判断该文件是否存在
            if(label){
            //说明已存在当天文件，则在文件内容后追加新数据
                out = new BufferedOutputStream(new FileOutputStream(fileName,true));


        }else{
            //说明不存在当天文件，则新建文本
            out =new BufferedOutputStream(new FileOutputStream(fileName));
            //新文件中需要写入的数据

        }
        } catch (IOException e){
            e.printStackTrace();

        }



    }
}
