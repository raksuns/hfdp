package com.raks.basic.file;

import java.io.File;

public class FileSize {
	public static void main(String args[]) {

		File oFile = new File(
				"/Volumes/raks/cloud/DaumCloud/01/1377518520_1d5aadccc9800efe75dae7f9d520b24f_PbSYMBScTmLqzi3mnbs5kznD.jpg");

		long L = oFile.length();
		int fileSize = 700 * 1024;
		System.out.println("Limit size : " + fileSize);
		System.out.println(L + " bytes : " + oFile.getAbsoluteFile());

		if (L < fileSize) {
			System.err.println("700K 이하.");
		} else {
			System.err.println("700K 이상");
		}
		
		int org = 1000 * 1024;
		int size = 700 * 1024;
		int minus = org - size;
		
		System.out.println(" result :  " + org);
		System.out.println(" size :  " + size);
		System.out.println(" Minus :  " + minus);
		System.out.println(" division :  " + (minus / org) + (minus % org));
		System.out.println(" namugy 1 :  " + (size / org));
		System.out.println(" namugy 2 :  " + (size % org));
		System.out.println(" Percent :  " + ((size / org) + (size % org)) * 100);
		System.out.println(" Percent :  " + (double) size / (double) org * 100.0);
	}
}
