package Yzy.Convert_Image_To_Text;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {

    public static void main(String[] args) throws TesseractException {
        ITesseract iTesseract = new Tesseract();
        File img = new File("D:\\E备份\\专业课\\Coding\\Tess4jImage\\Chinese.png");
        long startTime = System.currentTimeMillis();
        String ocrResult = iTesseract.doOCR(img);
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("识别结果：\n" + ocrResult);

    }


}
