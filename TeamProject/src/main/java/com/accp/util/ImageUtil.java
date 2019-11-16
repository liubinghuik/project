package com.accp.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;


public class ImageUtil {
    // 鍥剧墖鐨勫搴︺??
    private int width = 160;
    // 鍥剧墖鐨勯珮搴︺??
    private int height = 40;
    // 楠岃瘉鐮佸瓧绗︿釜鏁?
    private int codeCount = 5;
    // 楠岃瘉鐮佸共鎵扮嚎鏁?
    private int lineCount = 150;
    // 楠岃瘉鐮?
    private String code = null;
 
    private char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
 
    private BufferedImage bufferedImage;
 
    private ImageUtil(int width, int height){
        this.width = width;
        this.height = height;
    }
 
    public ImageUtil(int width, int height, int codeCount, int lineCount){
        this(width, height);
        this.codeCount = codeCount;
        this.lineCount = lineCount;
        createCodeImage();
    }
    private void createCodeImage(){
        //瀛楃鎵?鍦▁鍧愭爣
        int x = 0;
        //瀛椾綋楂樺害
        int fontHeight = 0;
        //瀛楃鎵?鍦▂鍧愭爣
        int codeY = 0;
        int red = 0;
        int green = 0;
        int blue = 0;
        x = width / (codeCount + 2);
        fontHeight = height - 2;
        codeY = height - 4;
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        Random random = new Random();
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, width,height);
        Font font = new Font("Fixedays",Font.PLAIN,fontHeight);
        graphics2D.setFont(font);
 
        for (int i = 0; i < lineCount; i++) {
            //x杞寸涓?涓偣鐨勪綅缃?
            int x1 = random.nextInt(width);
            //y杞寸涓?涓偣鐨勪綅缃?
            int y1 = random.nextInt(height);
            //x杞寸浜屼釜鐐圭殑浣嶇疆
            int x2 = x1 + random.nextInt(width >> 2);
            //y杞寸浜屼釜鐐圭殑浣嶇疆
            int y2 = y1 + random.nextInt(height >> 2);
 
            red = random.nextInt(255);
            green = random.nextInt(255);
            blue = random.nextInt(255);
 
            graphics2D.setColor(new Color(red, green, blue));
            graphics2D.drawLine(x1, y1, x2, y2);
        }
 
        StringBuffer randomCode = new StringBuffer(codeCount);
        for (int i = 0; i < codeCount; i++) {
            String strRand = String.valueOf(codeSequence[random.nextInt(codeSequence.length)]);
            red = random.nextInt(255);
            green = random.nextInt(255);
            blue = random.nextInt(255);
            graphics2D.setColor(new Color(red, green, blue));
            graphics2D.drawString(strRand, (i +1) * x, codeY);
            randomCode.append(strRand);
        }
        code = randomCode.toString();
    }
 
    public void write(String path) throws IOException {
        OutputStream outputStream = new FileOutputStream(path);
        this.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }
 
    public void write(OutputStream outputStream) throws IOException {
        ImageIO.write(bufferedImage, "png", outputStream);
    }
 
    public BufferedImage getBufferedImage(){
        return bufferedImage;
    }
 
    public String getCode(){
        return code;
    }
 
}

