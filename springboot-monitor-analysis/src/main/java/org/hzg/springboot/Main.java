package org.hzg.springboot;

import java.util.Scanner;

/**
 * Created by hzgal on 2019-11-2.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();
        String[] inputStrArr = inputStr.split(" ");
        StringBuilder sbTemp = null;
        StringBuilder sbResult = new StringBuilder();

        if(null != inputStrArr) {
            for (int i = 0; i < inputStrArr.length; i++) {
                sbTemp = new StringBuilder(inputStrArr[i]);
                sbResult.append(sbTemp.reverse());
                sbResult.append(" ");
            }

            System.out.println(sbResult.toString().substring(0,sbResult.length() - 1));
        }
    }
}
