package com.bily.encryptiontool;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;






import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * DES���� �����㷨
 * 
 * @author lifq
 * @date 2015-3-17 ����10:12:11
 */
public class DesUtil {

    private final static String DES = "DES";
    private final static String ENCODE = "GBK";
    private final static String defaultKey = "test1234";
    
    
    public DesUtil(){
    	
    }

    /**
     * ʹ�� Ĭ��key ����
     * 
     * @return String
     * @author lifq
     * @date 2015-3-17 ����02:46:43
     */
    public static String encrypt(String data) throws Exception {
        byte[] bt = encrypt(data.getBytes(ENCODE), defaultKey.getBytes(ENCODE));
        String strs = new BASE64Encoder().encode(bt);
        return strs;
    }

    /**
     * ʹ�� Ĭ��key ����
     * 
     * @return String
     * @author lifq
     * @date 2015-3-17 ����02:49:52
     */
    public static String decrypt(String data) throws IOException, Exception {
        if (data == null)
            return null;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = decoder.decodeBuffer(data);
        byte[] bt = decrypt(buf, defaultKey.getBytes(ENCODE));
        return new String(bt, ENCODE);
    }

    /**
     * Description ���ݼ�ֵ���м���
     * 
     * @param data
     * @param key
     *            ���ܼ�byte����
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {
        byte[] bt = encrypt(data.getBytes(ENCODE), defaultKey.getBytes(ENCODE));
        String strs = new BASE64Encoder().encode(bt);
        return strs;
    }

    /**
     * Description ���ݼ�ֵ���н���
     * 
     * @param data
     * @param key
     *            ���ܼ�byte����
     * @return
     * @throws IOException
     * @throws Exception
     */
    public static String decrypt(String data, String key) throws IOException,
            Exception {
        if (data == null)
            return null;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = decoder.decodeBuffer(data);
        byte[] bt = decrypt(buf, key.getBytes(ENCODE));
        return new String(bt, ENCODE);
    }

    /**
     * Description ���ݼ�ֵ���м���
     * 
     * @param data
     * @param key
     *            ���ܼ�byte����
     * @return
     * @throws Exception
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        // ����һ�������ε������Դ
        SecureRandom sr = new SecureRandom();

        // ��ԭʼ��Կ���ݴ���DESKeySpec����
        DESKeySpec dks = new DESKeySpec(key);

        // ����һ����Կ������Ȼ��������DESKeySpecת����SecretKey����
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher����ʵ����ɼ��ܲ���
        Cipher cipher = Cipher.getInstance(DES);

        // ����Կ��ʼ��Cipher����
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

        return cipher.doFinal(data);
    }

    /**
     * Description ���ݼ�ֵ���н���
     * 
     * @param data
     * @param key
     *            ���ܼ�byte����
     * @return
     * @throws Exception
     */
    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        // ����һ�������ε������Դ
        SecureRandom sr = new SecureRandom();

        // ��ԭʼ��Կ���ݴ���DESKeySpec����
        DESKeySpec dks = new DESKeySpec(key);

        // ����һ����Կ������Ȼ��������DESKeySpecת����SecretKey����
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher����ʵ����ɽ��ܲ���
        Cipher cipher = Cipher.getInstance(DES);

        // ����Կ��ʼ��Cipher����
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

        return cipher.doFinal(data);
    }
}
