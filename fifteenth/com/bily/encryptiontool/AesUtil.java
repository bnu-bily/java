package com.bily.encryptiontool;



import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**AES ��һ�ֿ�������㷨�����û���������Ϣ���ܴ���
 * ��ԭʼ���ݽ���AES���ܺ��ڽ���Base64����ת����
 */
public class AesUtil {
	/*
	 * �����õ�Key ������26����ĸ���������
	 * �˴�ʹ��AES-128-CBC����ģʽ��key��ҪΪ16λ��
	 */
	
	private static String ivParameter="0123456789abcdef";
	
	private AesUtil(){

	}
	
	// ����
	public static String encrypt(String sSrc,String key) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] raw = key.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());//ʹ��CBCģʽ����Ҫһ������iv�������Ӽ����㷨��ǿ��
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
		return new BASE64Encoder().encode(encrypted);//�˴�ʹ��BASE64��ת�롣
	}

	// ����
	public static String decrypt(String sSrc,String key) throws Exception {
		try {
			byte[] raw = key.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//����base64����
			byte[] original = cipher.doFinal(encrypted1);
			String originalString = new String(original,"utf-8");
			return originalString;
		} catch (Exception ex) {
			return null;
		}
	}

}
