package com.bily.encryptiontool;



import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.security.SecureRandom;  

import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;  
import javax.crypto.SecretKey;  

import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder; 

public class DesUtil {  
    /** 指定加密算法为DESede */  
    private static String ALGORITHM = "DESede";  
    /** 指定密钥存放文件 */  
    private static String KEYFile   = "KeyFile";  
    
    public DesUtil(){
    	
    }
    /** 
    * 生成密钥 
    */  
    private static void generateKey() throws Exception {  
        /** DES算法要求有一个可信任的随机数源 */  
        SecureRandom sr = new SecureRandom();  
        /** 为DES算法创建一个KeyGenerator对象 */  
        KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM);  
        /** 利用上面的随机数据源初始化这个KeyGenerator对象 */  
        kg.init(sr);  
        /** 生成密匙 */  
        SecretKey key = kg.generateKey();  
        /** 用对象流将生成的密钥写入文件 */  
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KEYFile));  
        oos.writeObject(key);  
        /** 清空缓存，关闭文件输出流 */  
        oos.close();  
    }  
  
    /** 
    * 加密方法 
    * 
    * source 源数据 
    */  
    public static String encrypt(String source) throws Exception {  
        generateKey();  
        /** 将文件中的SecretKey对象读出 */  
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KEYFile));  
        SecretKey key = (SecretKey) ois.readObject();  
        /** 得到Cipher对象来实现对源数据的DES加密 */  
        Cipher cipher = Cipher.getInstance(ALGORITHM);  
        cipher.init(Cipher.ENCRYPT_MODE, key);  
        byte[] b = source.getBytes();  
        /** 执行加密操作 */  
        byte[] b1 = cipher.doFinal(b);  
        BASE64Encoder encoder = new BASE64Encoder();  
        return encoder.encode(b1);  
    }  
  
    /** 
    * 解密密钥 cryptograph:密文 
    */  
    public static String decrypt(String cryptograph) throws Exception {  
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KEYFile));  
        SecretKey key = (SecretKey) ois.readObject();  
        Cipher cipher = Cipher.getInstance(ALGORITHM);  
        cipher.init(Cipher.DECRYPT_MODE, key);  
        BASE64Decoder decoder = new BASE64Decoder();  
        byte[] b1 = decoder.decodeBuffer(cryptograph);  
        byte[] b = cipher.doFinal(b1);  
        return new String(b);  
    }  
  
   
}  
