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
    /** ָ�������㷨ΪDESede */  
    private static String ALGORITHM = "DESede";  
    /** ָ����Կ����ļ� */  
    private static String KEYFile   = "KeyFile";  
    
    public DesUtil(){
    	
    }
    /** 
    * ������Կ 
    */  
    private static void generateKey() throws Exception {  
        /** DES�㷨Ҫ����һ�������ε������Դ */  
        SecureRandom sr = new SecureRandom();  
        /** ΪDES�㷨����һ��KeyGenerator���� */  
        KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM);  
        /** ����������������Դ��ʼ�����KeyGenerator���� */  
        kg.init(sr);  
        /** �����ܳ� */  
        SecretKey key = kg.generateKey();  
        /** �ö����������ɵ���Կд���ļ� */  
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KEYFile));  
        oos.writeObject(key);  
        /** ��ջ��棬�ر��ļ������ */  
        oos.close();  
    }  
  
    /** 
    * ���ܷ��� 
    * 
    * source Դ���� 
    */  
    public static String encrypt(String source) throws Exception {  
        generateKey();  
        /** ���ļ��е�SecretKey������� */  
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KEYFile));  
        SecretKey key = (SecretKey) ois.readObject();  
        /** �õ�Cipher������ʵ�ֶ�Դ���ݵ�DES���� */  
        Cipher cipher = Cipher.getInstance(ALGORITHM);  
        cipher.init(Cipher.ENCRYPT_MODE, key);  
        byte[] b = source.getBytes();  
        /** ִ�м��ܲ��� */  
        byte[] b1 = cipher.doFinal(b);  
        BASE64Encoder encoder = new BASE64Encoder();  
        return encoder.encode(b1);  
    }  
  
    /** 
    * ������Կ cryptograph:���� 
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
