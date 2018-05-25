package com.lfire.host.utils;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class FileUpload2 {

	public static String upload(String filename,File myfile)throws Exception{
		//�õ��ļ��ϴ��ķ�����·��
		HttpServletRequest request = ServletActionContext.getRequest();
		String path = request.getSession().getServletContext().getRealPath("")+"\\upload\\";
		
		//����ļ�ͬ������
		filename = UUID.randomUUID().toString().replace("-", "")+filename.substring(filename.lastIndexOf("."));
		//System.out.println("fffffffffffff="+filename);
		
		//��������������ļ�
		File newFile = new File(path+filename);
		
		//�����ϴ�
		FileUtils.copyFile(myfile, newFile);
		return filename;
	}
}
